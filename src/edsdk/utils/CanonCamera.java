package edsdk.utils;

import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.NativeLongByReference;
import edsdk.a.EdSdkLibrary;
import edsdk.a.EdSdkLibrary.EdsObjectEventHandler;
import edsdk.a.EdSdkLibrary.EdsVoid;
import edsdk.a.EdSdkLibrary.__EdsObject;
import edsdk.utils.commands.GetPropertyTask;
import edsdk.utils.commands.LiveViewTask;
import edsdk.utils.commands.SetPropertyTask;
import edsdk.utils.commands.ShootTask;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;


/**
 * This class should be the easiest way to use the canon sdk. Please note that
 * you _can_ use the sdk directly or also use this class to get the basic
 * communication running, and then communicate with the edsdk directly.
 *
 * Either way, one of the most important things to remember is that edsdk is not
 * multithreaded so your vm might crash if you just call functions from the
 * library. Instead I suggest you use the static method SLR.invoke( Runnable r
 * ); or the method canonCamera.invoke( CanonTask task );
 *
 * The later is basically the same, but allows you to easily get a return
 * integer value, like int result = SLR.invoke( new CanonTask(){ public int
 * run(){ return ...; } } );
 *
 *
 * This class also automatically processes and forwards all windows-style
 * messages. This is required to forward camera events into the edsdk. Currently
 * there is no way to disable this if it conflicts with your software.
 *
 * @author Christopher Williams
 */
public class CanonCamera implements EdsObjectEventHandler {

    private static final Map<String, Integer> options = new HashMap<String, Integer>();

    // This gives you direct access to the EDSDK
    public static EdSdkLibrary EDSDK = (EdSdkLibrary) Native.loadLibrary("Macintosh/EDSDK_64/EDSDK.framework", EdSdkLibrary.class, options);
    //private static final HMODULE hMod = Kernel32.INSTANCE.GetModuleHandle("");
    // The queue of commands that need to be run.
    private static ConcurrentLinkedQueue<CanonTask<?>> queue = new ConcurrentLinkedQueue<CanonTask<?>>();
    // Object Event Handlers
    private static ArrayList<EdsObjectEventHandler> objectEventHandlers = new ArrayList<EdsObjectEventHandler>(10);
    private static Thread dispatcherThread;

    static {
        // Tells the app to throw an error instead of crashing entirely.
        // Native.setProtected( true );
        // We actually want our apps to crash, because something very dramatic
        // is going on when the user receives this kind of crash message from
        // the os and it puts the developer under pressure to fix the issue.
        // If we enable Native.setProtected the app might just freeze,
        // which is more annoying than a proper crash.
        // Anyways, if you want the exception-throwing-instead-crashing behaviour
        // just call the above code as early as possible in your main method.

        // Start the dispatch thread
        dispatcherThread = new Thread() {
            public void run() {
                dispatchMessages();
            }
        };
        dispatcherThread.start();

        // people are sloppy!
        // so we add a shutdown hook to close camera connections
        // TODO: doesn't seem to work
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                CanonCamera.close();
            }
        });
    }
    /////////////////////////////////////////////
    // From here on it's instance variables
    private __EdsObject edsCamera;
    private String errorMessage;
    private int errorCode;

    public CanonCamera() {
    }

    public boolean openSession() {
        return executeNow(new OpenSessionCommand());
    }

    public boolean closeSession() {
        return executeNow(new CloseSessionCommand());
    }

    public __EdsObject getEdsCamera() {
        return edsCamera;
    }

    public File shoot() {
        return executeNow(new ShootTask());
    }

    public Boolean setProperty(long property, long value) {
        return executeNow(new SetPropertyTask(property, value));
    }

    public Long getProperty(long property) {
        return executeNow(new GetPropertyTask(property));
    }

    public void execute(CanonTask<?> cmd) {
        cmd.setSLR(this);
        queue.add(cmd);
    }

    public <T> T executeNow(CanonTask<T> cmd) {
        execute(cmd);
        return cmd.result();
    }

    public boolean setError(int result, String message) {
        errorMessage = message + " (code=" + result + ", _might_ mean " + CanonUtils.toString(result) + ")";
        errorCode = result;

        System.err.println(errorMessage);

        return false;
    }

    /**
     * Adds an object event handler
     */
    public void addObjectEventHandler(EdsObjectEventHandler handler) {
        objectEventHandlers.add(handler);
    }

    /**
     * Removes an object event handler
     */
    public void removeObjectEventHandler(EdsObjectEventHandler handler) {
        objectEventHandlers.remove(handler);
    }

    @Override
    public NativeLong apply(NativeLong inEvent, __EdsObject inRef, EdsVoid inContext) {
        System.out.println("Event!!!" + inEvent.doubleValue() + ", " + inContext);

        for (EdsObjectEventHandler handler : objectEventHandlers) {
            handler.apply(inEvent, inRef, inContext);
        }

        return new NativeLong(0);
    }

    /**
     * Dispatches windows messages and executes tasks
     */
    private static void dispatchMessages() {
        // Do some initializing
        int err = EDSDK.EdsInitializeSDK().intValue();
        if (err != EdSdkLibrary.EDS_ERR_OK) {
            System.err.println("EDSDK failed to initialize, most likely you won't be able to speak to your slr");
        }

        CanonTask<?> task = null;

        while (!Thread.currentThread().isInterrupted()) {

            // is there a command we're currently working on?
            if (task != null) {
                if (task.finished()) {
                    System.out.println("Command finished");
                    // great!
                    task.camera.removeObjectEventHandler(task);
                    task = null;
                }
            }

            // are we free to do new work, and is there even new work to be done?
            if (!queue.isEmpty() && task == null) {
                System.out.println("Received new command, processing " + queue.peek().getClass().toString());
                task = queue.poll();
                if (!(task instanceof OpenSessionCommand)) {
                    task.camera.addObjectEventHandler(task);
                }
                task.run();
                task.ran();
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // we don't mind being interrupted
                //e.printStackTrace();
                break;
            }
        }

        EDSDK.EdsTerminateSDK();
        System.out.println("Dispatcher thread says bye!");
    }

    public static void close() {
        if (dispatcherThread != null && dispatcherThread.isAlive()) {
            dispatcherThread.interrupt();
            try {
                dispatcherThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class OpenSessionCommand extends CanonTask<Boolean> {

        public void run() {
            setResult(connect());
        }

        private boolean connect() {
            int result;

            __EdsObject list[] = new __EdsObject[10];
            result = EDSDK.EdsGetCameraList(list).intValue();
            if (result != EdSdkLibrary.EDS_ERR_OK) {
                return setError(result, "Camera failed to initialize");
            }


            NativeLongByReference outRef = new NativeLongByReference();
            result = EDSDK.EdsGetChildCount(list[0], outRef).intValue();
            if (result != EdSdkLibrary.EDS_ERR_OK) {
                return setError(result, "Number of attached cameras couldn't be read");
            }

            long numCams = outRef.getValue().longValue();
            if (numCams <= 0) {
                return setError(0, "No cameras found. Have you tried turning it off and on again?");
            }

            __EdsObject cameras[] = new __EdsObject[1];
            result = EDSDK.EdsGetChildAtIndex(list[0], new NativeLong(0), cameras).intValue();
            if (result != EdSdkLibrary.EDS_ERR_OK) {
                return setError(result, "Access to camera failed");
            }


            EdsVoid context = new EdsVoid(new Pointer(0));
            edsCamera = cameras[0];
            result = EDSDK.EdsSetObjectEventHandler(edsCamera, new NativeLong(EdSdkLibrary.kEdsObjectEvent_All), CanonCamera.this, context).intValue();
            if (result != EdSdkLibrary.EDS_ERR_OK) {
                return setError(result, "Callback handler couldn't be added. ");
            }

            result = EDSDK.EdsOpenSession(edsCamera).intValue();
            if (result != EdSdkLibrary.EDS_ERR_OK) {
                return setError(result, "Couldn't open camera session");
            }

            return true;
        }
    }

    private class CloseSessionCommand extends CanonTask<Boolean> {

        public void run() {
            setResult(close());
        }

        private boolean close() {
            System.out.println("closing session");
            int result = EDSDK.EdsCloseSession(edsCamera).intValue();

            if (result != EdSdkLibrary.EDS_ERR_OK) {
                return setError(result, "Couldn't close camera session");
            }

            return true;
        }
    }

    public boolean beginLiveView() {
        return executeNow(new LiveViewTask.Begin());
    }

    public boolean endLiveView() {
        return executeNow(new LiveViewTask.End());
    }

    public BufferedImage downloadLiveView() {
        return executeNow(new LiveViewTask.Download());
    }
}
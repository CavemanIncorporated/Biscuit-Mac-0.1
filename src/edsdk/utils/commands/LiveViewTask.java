package edsdk.utils.commands;

import edsdk.utils.CanonTask;
import edsdk.utils.CanonUtils;
import java.awt.image.BufferedImage;

public class LiveViewTask {

    public static class Begin extends CanonTask<Boolean> {

        @Override
        public void run() {
            setResult(CanonUtils.beginLiveView(camera.getEdsCamera()));
        }
    }

    public static class End extends CanonTask<Boolean> {

        @Override
        public void run() {
            setResult(CanonUtils.endLiveView(camera.getEdsCamera()));
        }
    }

    public static class Download extends CanonTask<BufferedImage> {

        @Override
        public void run() {
            setResult(CanonUtils.downloadLiveViewImage(camera.getEdsCamera()));
        }
    }
}

package edsdk.a;

import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

public class EdsDeviceInfo extends Structure {
    /// C type : EdsChar[256]

    public byte[] szPortName = new byte[(256)];
    /// C type : EdsChar[256]
    public byte[] szDeviceDescription = new byte[(256)];
    /// C type : EdsUInt32
    public NativeLong deviceSubType;
    /// C type : EdsUInt32
    public NativeLong reserved;

    public EdsDeviceInfo() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder(new java.lang.String[]{"szPortName", "szDeviceDescription", "deviceSubType", "reserved"});
    }

    /**
     * @param szPortName C type : EdsChar[256]<br>
     * @param szDeviceDescription C type : EdsChar[256]<br>
     * @param deviceSubType C type : EdsUInt32<br>
     * @param reserved C type : EdsUInt32
     */
    public EdsDeviceInfo(byte szPortName[], byte szDeviceDescription[], NativeLong deviceSubType, NativeLong reserved) {
        super();
        if (szPortName.length != this.szPortName.length) {
            throw new IllegalArgumentException("Wrong array size !");
        }
        this.szPortName = szPortName;
        if (szDeviceDescription.length != this.szDeviceDescription.length) {
            throw new IllegalArgumentException("Wrong array size !");
        }
        this.szDeviceDescription = szDeviceDescription;
        this.deviceSubType = deviceSubType;
        this.reserved = reserved;
        initFieldOrder();
    }

    public static class ByReference extends EdsDeviceInfo implements Structure.ByReference {
    };

    public static class ByValue extends EdsDeviceInfo implements Structure.ByValue {
    };
}

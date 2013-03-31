package edsdk.a;

import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

public class EdsImageInfo extends Structure {
    /// C type : EdsUInt32

    public NativeLong width;
    /// C type : EdsUInt32
    public NativeLong height;
    /// C type : EdsUInt32
    public NativeLong numOfComponents;
    /// C type : EdsUInt32
    public NativeLong componentDepth;
    /// C type : EdsRect
    public EdsRect effectiveRect;
    /// C type : EdsUInt32
    public NativeLong reserved1;
    /// C type : EdsUInt32
    public NativeLong reserved2;

    public EdsImageInfo() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder(new java.lang.String[]{"width", "height", "numOfComponents", "componentDepth", "effectiveRect", "reserved1", "reserved2"});
    }

    /**
     * @param width C type : EdsUInt32<br>
     * @param height C type : EdsUInt32<br>
     * @param numOfComponents C type : EdsUInt32<br>
     * @param componentDepth C type : EdsUInt32<br>
     * @param effectiveRect C type : EdsRect<br>
     * @param reserved1 C type : EdsUInt32<br>
     * @param reserved2 C type : EdsUInt32
     */
    public EdsImageInfo(NativeLong width, NativeLong height, NativeLong numOfComponents, NativeLong componentDepth, EdsRect effectiveRect, NativeLong reserved1, NativeLong reserved2) {
        super();
        this.width = width;
        this.height = height;
        this.numOfComponents = numOfComponents;
        this.componentDepth = componentDepth;
        this.effectiveRect = effectiveRect;
        this.reserved1 = reserved1;
        this.reserved2 = reserved2;
        initFieldOrder();
    }

    public static class ByReference extends EdsImageInfo implements Structure.ByReference {
    };

    public static class ByValue extends EdsImageInfo implements Structure.ByValue {
    };
}

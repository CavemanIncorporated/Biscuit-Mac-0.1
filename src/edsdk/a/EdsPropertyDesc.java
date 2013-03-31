package edsdk.a;

import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

public class EdsPropertyDesc extends Structure {
    /// C type : EdsInt32

    public NativeLong form;
    /// C type : EdsInt32
    public NativeLong access;
    /// C type : EdsInt32
    public NativeLong numElements;
    /// C type : EdsInt32[128]
    public NativeLong[] propDesc = new NativeLong[(128)];

    public EdsPropertyDesc() {
        super();
        initFieldOrder();
    }

    protected void initFieldOrder() {
        setFieldOrder(new java.lang.String[]{"form", "access", "numElements", "propDesc"});
    }

    /**
     * @param form C type : EdsInt32<br>
     * @param access C type : EdsInt32<br>
     * @param numElements C type : EdsInt32<br>
     * @param propDesc C type : EdsInt32[128]
     */
    public EdsPropertyDesc(NativeLong form, NativeLong access, NativeLong numElements, NativeLong propDesc[]) {
        super();
        this.form = form;
        this.access = access;
        this.numElements = numElements;
        if (propDesc.length != this.propDesc.length) {
            throw new IllegalArgumentException("Wrong array size !");
        }
        this.propDesc = propDesc;
        initFieldOrder();
    }

    public static class ByReference extends EdsPropertyDesc implements Structure.ByReference {
    };

    public static class ByValue extends EdsPropertyDesc implements Structure.ByValue {
    };
}

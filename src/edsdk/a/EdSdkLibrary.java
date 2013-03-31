package edsdk.a;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.NativeLongByReference;
import com.sun.jna.ptr.PointerByReference;
import com.sun.jna.ptr.ShortByReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public interface EdSdkLibrary extends Library {
//	public static final String JNA_LIBRARY_NAME = LibraryExtractor.getLibraryPath("EdSdk", true, edsdk.EdSdkLibrary.class);
//	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(edsdk.EdSdkLibrary.JNA_LIBRARY_NAME, com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper.DEFAULT_OPTIONS);
//	public static final EdSdkLibrary INSTANCE = (EdSdkLibrary)Native.loadLibrary(edsdk.EdSdkLibrary.JNA_LIBRARY_NAME, edsdk.EdSdkLibrary.class, com.ochafik.lang.jnaerator.runtime.MangledFunctionMapper.DEFAULT_OPTIONS);

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsDataType {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:134</i>

        public static final int kEdsDataType_Unknown = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:135</i>
        public static final int kEdsDataType_Bool = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:136</i>
        public static final int kEdsDataType_String = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:137</i>
        public static final int kEdsDataType_Int8 = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:138</i>
        public static final int kEdsDataType_UInt8 = 6;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:139</i>
        public static final int kEdsDataType_Int16 = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:140</i>
        public static final int kEdsDataType_UInt16 = 7;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:141</i>
        public static final int kEdsDataType_Int32 = 8;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:142</i>
        public static final int kEdsDataType_UInt32 = 9;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:143</i>
        public static final int kEdsDataType_Int64 = 10;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:144</i>
        public static final int kEdsDataType_UInt64 = 11;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:145</i>
        public static final int kEdsDataType_Float = 12;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:146</i>
        public static final int kEdsDataType_Double = 13;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:147</i>
        public static final int kEdsDataType_ByteBlock = 14;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:148</i>
        public static final int kEdsDataType_Rational = 20;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:149</i>
        public static final int kEdsDataType_Point = 21;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:150</i>
        public static final int kEdsDataType_Rect = 22;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:151</i>
        public static final int kEdsDataType_Time = 23;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:153</i>
        public static final int kEdsDataType_Bool_Array = 30;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:154</i>
        public static final int kEdsDataType_Int8_Array = 31;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:155</i>
        public static final int kEdsDataType_Int16_Array = 32;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:156</i>
        public static final int kEdsDataType_Int32_Array = 33;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:157</i>
        public static final int kEdsDataType_UInt8_Array = 34;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:158</i>
        public static final int kEdsDataType_UInt16_Array = 35;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:159</i>
        public static final int kEdsDataType_UInt32_Array = 36;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:160</i>
        public static final int kEdsDataType_Rational_Array = 37;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:162</i>
        public static final int kEdsDataType_FocusInfo = 101;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:163</i>
        public static final int kEdsDataType_PictureStyleDesc = 102;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsEvfAf {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:323</i>

        public static final int kEdsCameraCommand_EvfAf_OFF = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:324</i>
        public static final int kEdsCameraCommand_EvfAf_ON = 1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsShutterButton {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:329</i>

        public static final int kEdsCameraCommand_ShutterButton_OFF = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:330</i>
        public static final int kEdsCameraCommand_ShutterButton_Halfway = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:331</i>
        public static final int kEdsCameraCommand_ShutterButton_Completely = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:332</i>
        public static final int kEdsCameraCommand_ShutterButton_Halfway_NonAF = 65537;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:333</i>
        public static final int kEdsCameraCommand_ShutterButton_Completely_NonAF = 65539;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsEvfDriveLens {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:532</i>

        public static final int kEdsEvfDriveLens_Near1 = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:533</i>
        public static final int kEdsEvfDriveLens_Near2 = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:534</i>
        public static final int kEdsEvfDriveLens_Near3 = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:535</i>
        public static final int kEdsEvfDriveLens_Far1 = 32769;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:536</i>
        public static final int kEdsEvfDriveLens_Far2 = 32770;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:537</i>
        public static final int kEdsEvfDriveLens_Far3 = 32771;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsEvfDepthOfFieldPreview {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:546</i>

        public static final int kEdsEvfDepthOfFieldPreview_OFF = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:547</i>
        public static final int kEdsEvfDepthOfFieldPreview_ON = 1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsSeekOrigin {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:556</i>

        public static final int kEdsSeek_Cur = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:557</i>
        public static final int kEdsSeek_Begin = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:558</i>
        public static final int kEdsSeek_End = 2;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsAccess {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:567</i>

        public static final int kEdsAccess_Read = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:568</i>
        public static final int kEdsAccess_Write = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:569</i>
        public static final int kEdsAccess_ReadWrite = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:570</i>
        public static final int kEdsAccess_Error = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsFileCreateDisposition {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:579</i>

        public static final int kEdsFileCreateDisposition_CreateNew = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:580</i>
        public static final int kEdsFileCreateDisposition_CreateAlways = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:581</i>
        public static final int kEdsFileCreateDisposition_OpenExisting = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:582</i>
        public static final int kEdsFileCreateDisposition_OpenAlways = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:583</i>
        public static final int kEdsFileCreateDisposition_TruncateExsisting = 4;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsImageType {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:594</i>

        public static final int kEdsImageType_Unknown = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:595</i>
        public static final int kEdsImageType_Jpeg = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:596</i>
        public static final int kEdsImageType_CRW = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:597</i>
        public static final int kEdsImageType_RAW = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:598</i>
        public static final int kEdsImageType_CR2 = 6;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:599</i>
        public static final int kEdsImageType_MOVwithTHM = 12;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:600</i>
        public static final int kEdsImageType_MOVwithoutTHM = 13;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsImageSize {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:609</i>

        public static final int kEdsImageSize_Large = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:610</i>
        public static final int kEdsImageSize_Middle = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:611</i>
        public static final int kEdsImageSize_Small = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:612</i>
        public static final int kEdsImageSize_Middle1 = 5;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:613</i>
        public static final int kEdsImageSize_Middle2 = 6;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:614</i>
        public static final int kEdsImageSize_Unknown = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsCompressQuality {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:623</i>

        public static final int kEdsCompressQuality_Normal = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:624</i>
        public static final int kEdsCompressQuality_Fine = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:625</i>
        public static final int kEdsCompressQuality_Lossless = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:626</i>
        public static final int kEdsCompressQuality_SuperFine = 5;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:627</i>
        public static final int kEdsCompressQuality_Unknown = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsImageQuality {

        /**
         * Jpeg Only<br> Jpeg Only<br> Jpeg Large<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:638</i>
         */
        public static final int EdsImageQuality_LJ = 1113871;
        /**
         * Jpeg Middle1<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:639</i>
         */
        public static final int EdsImageQuality_M1J = 84999951;
        /**
         * Jpeg Middle2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:640</i>
         */
        public static final int EdsImageQuality_M2J = 101777167;
        /**
         * Jpeg Small<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:641</i>
         */
        public static final int EdsImageQuality_SJ = 34668303;
        /**
         * Jpeg Large Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:642</i>
         */
        public static final int EdsImageQuality_LJF = 1310479;
        /**
         * Jpeg Large Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:643</i>
         */
        public static final int EdsImageQuality_LJN = 1244943;
        /**
         * Jpeg Middle Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:644</i>
         */
        public static final int EdsImageQuality_MJF = 18087695;
        /**
         * Jpeg Middle Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:645</i>
         */
        public static final int EdsImageQuality_MJN = 18022159;
        /**
         * Jpeg Small Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:646</i>
         */
        public static final int EdsImageQuality_SJF = 34864911;
        /**
         * Jpeg Small Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:647</i>
         */
        public static final int EdsImageQuality_SJN = 34864911;
        /**
         * Jpeg Small1 Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:648</i>
         */
        public static final int EdsImageQuality_S1JF = 236191503;
        /**
         * Jpeg Small1 Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:649</i>
         */
        public static final int EdsImageQuality_S1JN = 236125967;
        /**
         * Jpeg Small2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:650</i>
         */
        public static final int EdsImageQuality_S2JF = 252968719;
        /**
         * Jpeg Small3<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:651</i>
         */
        public static final int EdsImageQuality_S3JF = 269745935;
        /**
         * RAW + Jpeg<br> RAW + Jpeg<br> RAW<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:654</i>
         */
        public static final int EdsImageQuality_LR = 6618895;
        /**
         * RAW + Jpeg Large Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:655</i>
         */
        public static final int EdsImageQuality_LRLJF = 6553619;
        /**
         * RAW + Jpeg Large Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:656</i>
         */
        public static final int EdsImageQuality_LRLJN = 6553618;
        /**
         * RAW + Jpeg Middle Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:657</i>
         */
        public static final int EdsImageQuality_LRMJF = 6553875;
        /**
         * RAW + Jpeg Middle Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:658</i>
         */
        public static final int EdsImageQuality_LRMJN = 6553874;
        /**
         * RAW + Jpeg Small Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:659</i>
         */
        public static final int EdsImageQuality_LRSJF = 6554131;
        /**
         * RAW + Jpeg Small Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:660</i>
         */
        public static final int EdsImageQuality_LRSJN = 6554130;
        /**
         * RAW + Jpeg Small1 Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:661</i>
         */
        public static final int EdsImageQuality_LRS1JF = 6557203;
        /**
         * RAW + Jpeg Small1 Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:662</i>
         */
        public static final int EdsImageQuality_LRS1JN = 6557202;
        /**
         * RAW + Jpeg Small2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:663</i>
         */
        public static final int EdsImageQuality_LRS2JF = 6557459;
        /**
         * RAW + Jpeg Small3<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:664</i>
         */
        public static final int EdsImageQuality_LRS3JF = 6557715;
        /**
         * RAW + Jpeg Large<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:666</i>
         */
        public static final int EdsImageQuality_LRLJ = 6553616;
        /**
         * RAW + Jpeg Middle1<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:667</i>
         */
        public static final int EdsImageQuality_LRM1J = 6554896;
        /**
         * RAW + Jpeg Middle2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:668</i>
         */
        public static final int EdsImageQuality_LRM2J = 6555152;
        /**
         * RAW + Jpeg Small<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:669</i>
         */
        public static final int EdsImageQuality_LRSJ = 6554128;
        /**
         * MRAW(SRAW1) + Jpeg<br> MRAW(SRAW1) + Jpeg<br> MRAW(SRAW1)<br>
         * <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:672</i>
         */
        public static final int EdsImageQuality_MR = 23396111;
        /**
         * MRAW(SRAW1) + Jpeg Large Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:673</i>
         */
        public static final int EdsImageQuality_MRLJF = 23330835;
        /**
         * MRAW(SRAW1) + Jpeg Large Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:674</i>
         */
        public static final int EdsImageQuality_MRLJN = 23330834;
        /**
         * MRAW(SRAW1) + Jpeg Middle Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:675</i>
         */
        public static final int EdsImageQuality_MRMJF = 23331091;
        /**
         * MRAW(SRAW1) + Jpeg Middle Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:676</i>
         */
        public static final int EdsImageQuality_MRMJN = 23331090;
        /**
         * MRAW(SRAW1) + Jpeg Small Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:677</i>
         */
        public static final int EdsImageQuality_MRSJF = 23331347;
        /**
         * MRAW(SRAW1) + Jpeg Small Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:678</i>
         */
        public static final int EdsImageQuality_MRSJN = 23331346;
        /**
         * MRAW(SRAW1) + Jpeg Small1 Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:679</i>
         */
        public static final int EdsImageQuality_MRS1JF = 23334419;
        /**
         * MRAW(SRAW1) + Jpeg Small1 Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:680</i>
         */
        public static final int EdsImageQuality_MRS1JN = 23334418;
        /**
         * MRAW(SRAW1) + Jpeg Small2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:681</i>
         */
        public static final int EdsImageQuality_MRS2JF = 23334675;
        /**
         * MRAW(SRAW1) + Jpeg Small3<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:682</i>
         */
        public static final int EdsImageQuality_MRS3JF = 23334931;
        /**
         * MRAW(SRAW1) + Jpeg Large<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:684</i>
         */
        public static final int EdsImageQuality_MRLJ = 23330832;
        /**
         * MRAW(SRAW1) + Jpeg Middle1<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:685</i>
         */
        public static final int EdsImageQuality_MRM1J = 23332112;
        /**
         * MRAW(SRAW1) + Jpeg Middle2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:686</i>
         */
        public static final int EdsImageQuality_MRM2J = 23332368;
        /**
         * MRAW(SRAW1) + Jpeg Small<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:687</i>
         */
        public static final int EdsImageQuality_MRSJ = 23331344;
        /**
         * SRAW(SRAW2) + Jpeg<br> SRAW(SRAW2) + Jpeg<br> SRAW(SRAW2)<br>
         * <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:690</i>
         */
        public static final int EdsImageQuality_SR = 40173327;
        /**
         * SRAW(SRAW2) + Jpeg Large Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:691</i>
         */
        public static final int EdsImageQuality_SRLJF = 40108051;
        /**
         * SRAW(SRAW2) + Jpeg Large Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:692</i>
         */
        public static final int EdsImageQuality_SRLJN = 40108050;
        /**
         * SRAW(SRAW2) + Jpeg Middle Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:693</i>
         */
        public static final int EdsImageQuality_SRMJF = 40108307;
        /**
         * SRAW(SRAW2) + Jpeg Middle Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:694</i>
         */
        public static final int EdsImageQuality_SRMJN = 40108306;
        /**
         * SRAW(SRAW2) + Jpeg Small Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:695</i>
         */
        public static final int EdsImageQuality_SRSJF = 40108563;
        /**
         * SRAW(SRAW2) + Jpeg Small Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:696</i>
         */
        public static final int EdsImageQuality_SRSJN = 40108562;
        /**
         * SRAW(SRAW2) + Jpeg Small1 Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:697</i>
         */
        public static final int EdsImageQuality_SRS1JF = 40111635;
        /**
         * SRAW(SRAW2) + Jpeg Small1 Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:698</i>
         */
        public static final int EdsImageQuality_SRS1JN = 40111634;
        /**
         * SRAW(SRAW2) + Jpeg Small2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:699</i>
         */
        public static final int EdsImageQuality_SRS2JF = 40111891;
        /**
         * SRAW(SRAW2) + Jpeg Small3<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:700</i>
         */
        public static final int EdsImageQuality_SRS3JF = 40112147;
        /**
         * SRAW(SRAW2) + Jpeg Large<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:702</i>
         */
        public static final int EdsImageQuality_SRLJ = 40108048;
        /**
         * SRAW(SRAW2) + Jpeg Middle1<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:703</i>
         */
        public static final int EdsImageQuality_SRM1J = 40109328;
        /**
         * SRAW(SRAW2) + Jpeg Middle2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:704</i>
         */
        public static final int EdsImageQuality_SRM2J = 40109584;
        /**
         * SRAW(SRAW2) + Jpeg Small<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:705</i>
         */
        public static final int EdsImageQuality_SRSJ = 40108560;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:707</i>
        public static final int EdsImageQuality_Unknown = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsImageQualityForLegacy {

        /**
         * Jpeg Large<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:712</i>
         */
        public static final int kEdsImageQualityForLegacy_LJ = 2031631;
        /**
         * Jpeg Middle1<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:713</i>
         */
        public static final int kEdsImageQualityForLegacy_M1J = 85917711;
        /**
         * Jpeg Middle2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:714</i>
         */
        public static final int kEdsImageQualityForLegacy_M2J = 102694927;
        /**
         * Jpeg Small<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:715</i>
         */
        public static final int kEdsImageQualityForLegacy_SJ = 35586063;
        /**
         * Jpeg Large Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:716</i>
         */
        public static final int kEdsImageQualityForLegacy_LJF = 1245184;
        /**
         * Jpeg Large Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:717</i>
         */
        public static final int kEdsImageQualityForLegacy_LJN = 1179648;
        /**
         * Jpeg Middle Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:718</i>
         */
        public static final int kEdsImageQualityForLegacy_MJF = 18022400;
        /**
         * Jpeg Middle Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:719</i>
         */
        public static final int kEdsImageQualityForLegacy_MJN = 17956864;
        /**
         * Jpeg Small Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:720</i>
         */
        public static final int kEdsImageQualityForLegacy_SJF = 34799616;
        /**
         * Jpeg Small Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:721</i>
         */
        public static final int kEdsImageQualityForLegacy_SJN = 34799616;
        /**
         * RAW<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:723</i>
         */
        public static final int kEdsImageQualityForLegacy_LR = 2359296;
        /**
         * RAW + Jpeg Large Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:724</i>
         */
        public static final int kEdsImageQualityForLegacy_LRLJF = 2359315;
        /**
         * RAW + Jpeg Large Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:725</i>
         */
        public static final int kEdsImageQualityForLegacy_LRLJN = 2359314;
        /**
         * RAW + Jpeg Middle Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:726</i>
         */
        public static final int kEdsImageQualityForLegacy_LRMJF = 2359571;
        /**
         * RAW + Jpeg Middle Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:727</i>
         */
        public static final int kEdsImageQualityForLegacy_LRMJN = 2359570;
        /**
         * RAW + Jpeg Small Fine<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:728</i>
         */
        public static final int kEdsImageQualityForLegacy_LRSJF = 2359827;
        /**
         * RAW + Jpeg Small Normal<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:729</i>
         */
        public static final int kEdsImageQualityForLegacy_LRSJN = 2359826;
        /**
         * RAW<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:731</i>
         */
        public static final int kEdsImageQualityForLegacy_LR2 = 3080207;
        /**
         * RAW + Jpeg Large<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:732</i>
         */
        public static final int kEdsImageQualityForLegacy_LR2LJ = 3080223;
        /**
         * RAW + Jpeg Middle1<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:733</i>
         */
        public static final int kEdsImageQualityForLegacy_LR2M1J = 3081503;
        /**
         * RAW + Jpeg Middle2<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:734</i>
         */
        public static final int kEdsImageQualityForLegacy_LR2M2J = 3081759;
        /**
         * RAW + Jpeg Small<br> <i>native declaration :
         * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:735</i>
         */
        public static final int kEdsImageQualityForLegacy_LR2SJ = 3080735;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:737</i>
        public static final int kEdsImageQualityForLegacy_Unknown = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsImageSource {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:745</i>

        public static final int kEdsImageSrc_FullView = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:746</i>
        public static final int kEdsImageSrc_Thumbnail = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:747</i>
        public static final int kEdsImageSrc_Preview = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:748</i>
        public static final int kEdsImageSrc_RAWThumbnail = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:749</i>
        public static final int kEdsImageSrc_RAWFullView = 4;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsTargetImageType {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:759</i>

        public static final int kEdsTargetImageType_Unknown = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:760</i>
        public static final int kEdsTargetImageType_Jpeg = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:761</i>
        public static final int kEdsTargetImageType_TIFF = 7;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:762</i>
        public static final int kEdsTargetImageType_TIFF16 = 8;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:763</i>
        public static final int kEdsTargetImageType_RGB = 9;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:764</i>
        public static final int kEdsTargetImageType_RGB16 = 10;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:765</i>
        public static final int kEdsTargetImageType_DIB = 11;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsProgressOption {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:774</i>

        public static final int kEdsProgressOption_NoReport = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:775</i>
        public static final int kEdsProgressOption_Done = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:776</i>
        public static final int kEdsProgressOption_Periodically = 2;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsFileAttributes {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:786</i>

        public static final int kEdsFileAttribute_Normal = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:787</i>
        public static final int kEdsFileAttribute_ReadOnly = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:788</i>
        public static final int kEdsFileAttribute_Hidden = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:789</i>
        public static final int kEdsFileAttribute_System = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:790</i>
        public static final int kEdsFileAttribute_Archive = 32;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsBatteryLevel2 {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:800</i>

        public static final int kEdsBatteryLevel2_Empty = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:801</i>
        public static final int kEdsBatteryLevel2_Low = 9;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:802</i>
        public static final int kEdsBatteryLevel2_Half = 49;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:803</i>
        public static final int kEdsBatteryLevel2_Normal = 80;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:804</i>
        public static final int kEdsBatteryLevel2_Hi = 69;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:805</i>
        public static final int kEdsBatteryLevel2_Quarter = 19;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:806</i>
        public static final int kEdsBatteryLevel2_Error = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:807</i>
        public static final int kEdsBatteryLevel2_BCLevel = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:808</i>
        public static final int kEdsBatteryLevel2_AC = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsSaveTo {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:816</i>

        public static final int kEdsSaveTo_Camera = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:817</i>
        public static final int kEdsSaveTo_Host = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:818</i>
        public static final int kEdsSaveTo_Both = EdSdkLibrary.EdsSaveTo.kEdsSaveTo_Camera | EdSdkLibrary.EdsSaveTo.kEdsSaveTo_Host;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsStorageType {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:827</i>

        public static final int kEdsStorageType_Non = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:828</i>
        public static final int kEdsStorageType_CF = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:829</i>
        public static final int kEdsStorageType_SD = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:830</i>
        public static final int kEdsStorageType_HD = 4;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsWhiteBalance {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:839</i>

        public static final int kEdsWhiteBalance_Auto = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:840</i>
        public static final int kEdsWhiteBalance_Daylight = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:841</i>
        public static final int kEdsWhiteBalance_Cloudy = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:842</i>
        public static final int kEdsWhiteBalance_Tangsten = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:843</i>
        public static final int kEdsWhiteBalance_Fluorescent = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:844</i>
        public static final int kEdsWhiteBalance_Strobe = 5;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:845</i>
        public static final int kEdsWhiteBalance_WhitePaper = 6;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:846</i>
        public static final int kEdsWhiteBalance_Shade = 8;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:847</i>
        public static final int kEdsWhiteBalance_ColorTemp = 9;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:848</i>
        public static final int kEdsWhiteBalance_PCSet1 = 10;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:849</i>
        public static final int kEdsWhiteBalance_PCSet2 = 11;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:850</i>
        public static final int kEdsWhiteBalance_PCSet3 = 12;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:851</i>
        public static final int kEdsWhiteBalance_WhitePaper2 = 15;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:852</i>
        public static final int kEdsWhiteBalance_WhitePaper3 = 16;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:853</i>
        public static final int kEdsWhiteBalance_WhitePaper4 = 18;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:854</i>
        public static final int kEdsWhiteBalance_WhitePaper5 = 19;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:855</i>
        public static final int kEdsWhiteBalance_PCSet4 = 20;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:856</i>
        public static final int kEdsWhiteBalance_PCSet5 = 21;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:857</i>
        public static final int kEdsWhiteBalance_Click = -1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:858</i>
        public static final int kEdsWhiteBalance_Pasted = -2;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsPhotoEffect {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:867</i>

        public static final int kEdsPhotoEffect_Off = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:868</i>
        public static final int kEdsPhotoEffect_Monochrome = 5;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsColorMatrix {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:877</i>

        public static final int kEdsColorMatrix_Custom = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:878</i>
        public static final int kEdsColorMatrix_1 = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:879</i>
        public static final int kEdsColorMatrix_2 = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:880</i>
        public static final int kEdsColorMatrix_3 = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:881</i>
        public static final int kEdsColorMatrix_4 = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:882</i>
        public static final int kEdsColorMatrix_5 = 5;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:883</i>
        public static final int kEdsColorMatrix_6 = 6;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:884</i>
        public static final int kEdsColorMatrix_7 = 7;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsFilterEffect {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:893</i>

        public static final int kEdsFilterEffect_None = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:894</i>
        public static final int kEdsFilterEffect_Yellow = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:895</i>
        public static final int kEdsFilterEffect_Orange = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:896</i>
        public static final int kEdsFilterEffect_Red = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:897</i>
        public static final int kEdsFilterEffect_Green = 4;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsTonigEffect {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:906</i>

        public static final int kEdsTonigEffect_None = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:907</i>
        public static final int kEdsTonigEffect_Sepia = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:908</i>
        public static final int kEdsTonigEffect_Blue = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:909</i>
        public static final int kEdsTonigEffect_Purple = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:910</i>
        public static final int kEdsTonigEffect_Green = 4;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsColorSpace {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:919</i>

        public static final int kEdsColorSpace_sRGB = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:920</i>
        public static final int kEdsColorSpace_AdobeRGB = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:921</i>
        public static final int kEdsColorSpace_Unknown = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsPictureStyle {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:930</i>

        public static final int kEdsPictureStyle_Standard = 129;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:931</i>
        public static final int kEdsPictureStyle_Portrait = 130;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:932</i>
        public static final int kEdsPictureStyle_Landscape = 131;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:933</i>
        public static final int kEdsPictureStyle_Neutral = 132;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:934</i>
        public static final int kEdsPictureStyle_Faithful = 133;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:935</i>
        public static final int kEdsPictureStyle_Monochrome = 134;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:936</i>
        public static final int kEdsPictureStyle_User1 = 33;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:937</i>
        public static final int kEdsPictureStyle_User2 = 34;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:938</i>
        public static final int kEdsPictureStyle_User3 = 35;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:939</i>
        public static final int kEdsPictureStyle_PC1 = 65;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:940</i>
        public static final int kEdsPictureStyle_PC2 = 66;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:941</i>
        public static final int kEdsPictureStyle_PC3 = 67;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsTransferOption {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:950</i>

        public static final int kEdsTransferOption_ByDirectTransfer = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:951</i>
        public static final int kEdsTransferOption_ByRelease = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:952</i>
        public static final int kEdsTransferOption_ToDesktop = 256;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsAEMode {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:961</i>

        public static final int kEdsAEMode_Program = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:962</i>
        public static final int kEdsAEMode_Tv = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:963</i>
        public static final int kEdsAEMode_Av = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:964</i>
        public static final int kEdsAEMode_Manual = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:965</i>
        public static final int kEdsAEMode_Bulb = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:966</i>
        public static final int kEdsAEMode_A_DEP = 5;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:967</i>
        public static final int kEdsAEMode_DEP = 6;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:968</i>
        public static final int kEdsAEMode_Custom = 7;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:969</i>
        public static final int kEdsAEMode_Lock = 8;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:970</i>
        public static final int kEdsAEMode_Green = 9;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:971</i>
        public static final int kEdsAEMode_NightPortrait = 10;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:972</i>
        public static final int kEdsAEMode_Sports = 11;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:973</i>
        public static final int kEdsAEMode_Portrait = 12;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:974</i>
        public static final int kEdsAEMode_Landscape = 13;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:975</i>
        public static final int kEdsAEMode_Closeup = 14;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:976</i>
        public static final int kEdsAEMode_FlashOff = 15;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:977</i>
        public static final int kEdsAEMode_CreativeAuto = 19;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:978</i>
        public static final int kEdsAEMode_Movie = 20;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:979</i>
        public static final int kEdsAEMode_PhotoInMovie = 21;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:980</i>
        public static final int kEdsAEMode_Unknown = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsBracket {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:989</i>

        public static final int kEdsBracket_AEB = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:990</i>
        public static final int kEdsBracket_ISOB = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:991</i>
        public static final int kEdsBracket_WBB = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:992</i>
        public static final int kEdsBracket_FEB = 8;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:993</i>
        public static final int kEdsBracket_Unknown = -1;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsEvfOutputDevice {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1002</i>

        public static final int kEdsEvfOutputDevice_TFT = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1003</i>
        public static final int kEdsEvfOutputDevice_PC = 2;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsEvfZoom {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1011</i>

        public static final int kEdsEvfZoom_Fit = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1012</i>
        public static final int kEdsEvfZoom_x5 = 5;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1013</i>
        public static final int kEdsEvfZoom_x10 = 10;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsEvfAFMode {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1021</i>

        public static final int Evf_AFMode_Quick = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1022</i>
        public static final int Evf_AFMode_Live = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1023</i>
        public static final int Evf_AFMode_LiveFace = 2;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsStroboMode {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1031</i>

        public static final int kEdsStroboModeInternal = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1032</i>
        public static final int kEdsStroboModeExternalETTL = 1;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1033</i>
        public static final int kEdsStroboModeExternalATTL = 2;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1034</i>
        public static final int kEdsStroboModeExternalTTL = 3;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1035</i>
        public static final int kEdsStroboModeExternalAuto = 4;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1036</i>
        public static final int kEdsStroboModeExternalManual = 5;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1037</i>
        public static final int kEdsStroboModeManual = 6;
    };

    /**
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i><br> enum values
     */
    public static interface EdsETTL2Mode {
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1045</i>

        public static final int kEdsETTL2ModeEvaluative = 0;
        /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1046</i>
        public static final int kEdsETTL2ModeAverage = 1;
    };
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_SEEK_ERROR = 165;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_PARAMETER = 96;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_VolumeInfoChanged = 513;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_ShutDownTimerUpdate = 772;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_NOT_FOUND = 34;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_CMP_ID_CLIENT_COMPONENTID = 16777216;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Bracket = 1035;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSLatitudeRef = 2049;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_FN_CALL = 241;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_WhiteBalanceBracket = 1036;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INCOMPATIBLE_VERSION = 6;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_DriveMode = 1025;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_PROTECTION_VIOLATION = 9;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Copyright = 1049;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_FocalLength = 1033;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_DEVICEPROP_FORMAT = 8219;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_LensName = 1037;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_DISK_FULL_ERROR = 42;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_PictureStyle = 276;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_DigitalExposure = 261;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_WAIT_TIMEOUT_ERROR = 244;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_OBJECTFORMATCODE = 8203;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_MOVIE_CROP_NG = 36105;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_LENGTH = 100;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_WhiteBalanceShift = 264;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_FolderUpdateItems = 515;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_TRANSACTIONID = 8196;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_VolumeAdded = 524;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Contrast = 265;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_READ_ERROR = 167;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_DISK_ERROR = 136;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_FlashMode = 1044;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_SELECTION_UNAVAILABLE = 11;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int EDS_MAX_NAME = 256;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_RESERVED_MASK = 16711680;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_CMP_ID_HLSDK_COMPONENTID = 50331648;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_JobStatusChanged = 770;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_Histogram = 1290;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_ALREADY_OPEN = 162;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ISSPECIFIC_MASK = -2147483648;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_MyMenu = 14;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_DirItemRemoved = 517;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ICCProfile = 259;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_TOO_MANY_OPEN = 33;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_PictureStyleCaption = 512;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_UNEXPECTED_EXCEPTION = 8;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STI_DEVICE_RELEASE_ERROR = 227;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_SILENCE_NG = 36101;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_BatteryQuality = 16;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_DATA_CORRUPT = 45;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_OutputDevice = 1280;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_OwnerName = 4;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Sharpness = 268;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_SORT_FN = 102;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_DepthOfField = 1051;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_ENUM_NA = 240;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STI_UNKNOWN_ERROR = 224;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_POINTER = 98;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_WBCoeffs = 770;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSLongitude = 2052;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_INVALID = 130;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_USB_DEVICE_UNLOCK_ERROR = 209;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Tv = 1030;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_SPECIFICATION_OF_DESTINATION_UNSUPPORTED = 8224;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraStatusCommand_EnterDirectTransfer = 2;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_FirmwareVersion = 7;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DIR_IO_ERROR = 65;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_CAPTURE_ALREADY_TERMINATED = 8216;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_ID = 243;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_HDDirectoryStructure = 32;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_ALREADY_EXISTS = 43;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_MEMORY_FULL = 132;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSLongitudeRef = 2051;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_HANDLE = 97;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Artist = 1048;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_NOT_SUPPORTED = 7;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraCommand_DoClickWBEvf = 260;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_INDEX = 99;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_DirItemContentChanged = 519;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_PARENTOBJECT = 8218;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_NO_DISK = 135;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_ImagePosition = 1291;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_DateTime = 6;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraStatusCommand_UILock = 0;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_PERMISSION_ERROR = 169;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropertyEvent_PropertyChanged = 257;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_NOT_RELEASED = 141;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_MakerName = 5;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_DirItemCreated = 516;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_NO_VALID_OBJECTINFO = 8213;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraCommand_ExtendShutDownTimer = 1;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Av = 1029;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_CARD_NG = 36103;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_DIAL_CHANGED = 138;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_BUSY = 129;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_LENS_COVER_CLOSE = 40966;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ProductName = 2;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraCommand_BulbEnd = 3;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_BatteryLevel = 8;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Orientation = 258;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_FlashCompensation = 1032;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_CF_GATE_CHANGED = 137;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int EDS_TRANSFER_BLOCK_SIZE = 512;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h</i>
    public static final int oldif = 0;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSTimeStamp = 2055;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICEPROP_NOT_SUPPORTED = 8202;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_CFn = 9;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ColorMatrix = 275;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_NoiseReduction = 1041;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_COMM_PORT_IS_IN_USE = 192;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_LAST_GENERIC_ERROR_PLUS_ONE = 245;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSVersionID = 2048;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_ColorTemperature = 1283;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSStatus = 2057;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_END_OF_STREAM = 172;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_WRITE_ERROR = 40;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DIR_NOT_FOUND = 64;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ToneCurve = 270;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraCommand_PressShutterButton = 4;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_ZoomRect = 1345;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_OK = 0;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_AtCapture_Flag = -2147483648;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSDateStamp = 2077;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DIR_ENTRY_EXISTS = 67;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_SEEK_ERROR = 37;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_PROPERTIES_NOT_LOADED = 83;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_SESSION_NOT_OPEN = 8195;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_SaveTo = 11;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_CARD_PROTECT_NG = 36104;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ExposureCompensation = 1031;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_CurrentFolder = 13;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraStatusCommand_UIUnLock = 1;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_INTERNAL_ERROR = 133;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_FORMAT_UNRECOGNIZED = 44;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_InternalError = 774;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_COMPONENTID_MASK = 2130706432;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DIR_ENTRY_NOT_FOUND = 66;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraCommand_BulbStart = 2;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ColorTemperature = 263;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_BAD_OPTIONS = 171;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_VolumeUpdateItems = 514;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_COMM_BUFFER_FULL = 195;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_COMM_USB_BUS_ERR = 196;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ColorSpace = 269;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_AFMode = 1028;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_AF_NG = 36097;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_BulbExposureTime = 784;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_NOT_INSTALLED = 139;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_WhiteBalance = 1282;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_INVALID_PARAMETER = 134;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_PhotoEffect = 271;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_DepthOfFieldPreview = 1284;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_Mode = 1281;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_FocusAid = 1289;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_FlashOn = 1042;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ISOBracket = 1040;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_SPECIFICATION_BY_FORMAT_UNSUPPORTED = 8212;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_EFCompensation = 1054;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_PictureStyleDesc = 277;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraCommand_DoEvfAf = 258;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropertyEvent_PropertyDescChanged = 258;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ISOSpeed = 1026;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_PROPERTIES_MISMATCH = 81;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_WRITE_ERROR = 168;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INTERNAL_ERROR = 2;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_MEM_FREE_FAILED = 4;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_OPEN_ERROR = 35;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_JpegQuality = 257;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_BodyID = 3;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_CoordinateSystem = 1344;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STI_INTERNAL_ERROR = 225;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_AvailableShots = 1034;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STI_DEVICE_CREATE_ERROR = 226;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_CODE_FORMAT = 8214;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_AfResult = 777;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_All = 768;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERRORID_MASK = 65535;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_RedEye = 1043;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_UNIMPLEMENTED = 1;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_OPERATION_CANCELLED = 5;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_ZoomPosition = 1288;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_DirItemRequestTransfer = 520;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int NULL = 0;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TRANSACTION_CANCELLED = 8223;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_Zoom = 1287;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_All = 512;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_CLOSE_ERROR = 164;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_FilterEffect = 272;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_STRAGEID = 8200;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_MEM_ALLOC_FAILED = 3;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_FocusInfo = 260;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_STAY_AWAKE = 140;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_NOT_OPEN = 161;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropertyEvent_All = 256;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_DirItemCancelTransferDT = 522;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_MIRROR_UP_NG = 36099;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_HANDLE_NOT_FOUND = 242;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_Shutdown = 769;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_DEVICEPROP_VALUE = 8220;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_HistogramStatus = 1292;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSAltitudeRef = 2053;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_COMM_DEVICE_INCOMPATIBLE = 194;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_NOT_LAUNCHED = 228;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ImageQuality = 256;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_TELL_ERROR = 38;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_SESSION_ALREADY_OPEN = 8222;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_NOT_FOUND = 128;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_IO_ERROR = 160;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INVALID_FN_POINTER = 101;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int FALSE = 0;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_OPERATION_REFUSED = 40965;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSMapDatum = 2066;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_VolumeRemoved = 525;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_SELF_TEST_FAILED = 8209;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_WhiteBalance = 262;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSAltitude = 2054;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_COMM_DISCONNECTED = 193;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_DirItemRequestTransferDT = 521;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_USB_DEVICE_LOCK_ERROR = 208;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_CMP_ID_LLSDK_COMPONENTID = 33554432;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSSatellites = 2056;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_AEMode = 1024;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraCommand_DriveLensEvf = 259;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraStatusCommand_ExitDirectTransfer = 3;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ETTL2Mode = 279;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ToningEffect = 273;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DEVICE_EMERGENCY = 131;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsCameraCommand_TakePicture = 0;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_TELL_ERROR = 166;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_LensStatus = 1046;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_STROBO_CHARGE_NG = 36106;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ParameterSet = 274;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_CaptureError = 773;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Unknown = 65535;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_PROPERTIES_UNAVAILABLE = 80;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_AEBracket = 1038;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_PARTIAL_DELETION = 8210;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_RESERVED = 36098;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_COULDNT_BEGIN_THREAD = 170;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_READ_ERROR = 39;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ColorTone = 267;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_GPSLatitude = 2050;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_MISSING_SUBCOMPONENT = 10;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ColorSaturation = 266;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_MeteringMode = 1027;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_NAMING_NA = 46;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Linear = 768;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_IO_ERROR = 32;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_CurrentStorage = 12;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_FEBracket = 1039;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_PERMISSION_ERROR = 41;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_ClickWBPoint = 769;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsStateEvent_WillSoonShutDown = 771;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_SENSOR_CLEANING_NG = 36100;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int TRUE = 1;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_FILE_CLOSE_ERROR = 36;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_INCOMPLETE_TRANSFER = 8199;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_TAKE_PICTURE_NO_CARD_NG = 36102;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_LOW_BATTERY = 41217;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_UNKNOWN_COMMAND = 40961;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_UNKNOWN_VENDOR_CODE = 8215;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_STREAM_OPEN_ERROR = 163;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsObjectEvent_DirItemInfoChanged = 518;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_DIR_NOT_EMPTY = 68;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKErrors.h</i>
    public static final int EDS_ERR_OBJECT_NOTREADY = 41218;
    /// <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h</i>
    public static final int kEdsPropID_Evf_AFMode = 1294;

    /**
     * -----------------------------------------------------------------------------
     * <br> EdsProgressCallback <br>
     * -----------------------------------------------------------------------------<br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1249</i>
     */
    public interface EdsProgressCallback extends Callback {

        NativeLong apply(NativeLong inPercent, EdSdkLibrary.EdsVoid inContext, IntByReference outCancel);
    };

    /**
     * -----------------------------------------------------------------------------
     * <br> EdsCameraAddedHandler <br>
     * -----------------------------------------------------------------------------<br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1257</i>
     */
    public interface EdsCameraAddedHandler extends Callback {

        NativeLong apply(EdSdkLibrary.EdsVoid inContext);
    };

    /**
     * -----------------------------------------------------------------------------
     * <br> EdsPropertyEventHandler <br>
     * -----------------------------------------------------------------------------<br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1263</i>
     */
    public interface EdsPropertyEventHandler extends Callback {

        NativeLong apply(NativeLong inEvent, NativeLong inPropertyID, NativeLong inParam, EdSdkLibrary.EdsVoid inContext);
    };

    /**
     * -----------------------------------------------------------------------------
     * <br> EdsObjectEventHandler <br>
     * -----------------------------------------------------------------------------<br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1272</i>
     */
    public interface EdsObjectEventHandler extends Callback {

        NativeLong apply(NativeLong inEvent, EdSdkLibrary.__EdsObject inRef, EdSdkLibrary.EdsVoid inContext);
    };

    /**
     * -----------------------------------------------------------------------------
     * <br> EdsStateEventHandler <br>
     * -----------------------------------------------------------------------------<br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDKTypes.h:1280</i>
     */
    public interface EdsStateEventHandler extends Callback {

        NativeLong apply(NativeLong inEvent, NativeLong inEventData, EdSdkLibrary.EdsVoid inContext);
    };

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsInitializeSDK <br> // <br> // Description:
     * <br> // Initializes the libraries. <br> // When using the EDSDK
     * libraries, you must call this API once <br> // before using EDSDK APIs.
     * <br> // <br> // Parameters: <br> // In: None <br> // Out: None <br> //
     * <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsInitializeSDK()</code><br> <i>native
     * declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:57</i>
     */
    NativeLong EdsInitializeSDK();

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsTerminateSDK <br> // <br> // Description:
     * <br> // Terminates use of the libraries. <br> // This function muse be
     * called when ending the SDK. <br> // Calling this function releases all
     * resources allocated by the libraries. <br> // <br> // Parameters: <br> //
     * In: None <br> // Out: None <br> // <br> // Returns: Any of the sdk
     * errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsTerminateSDK()</code><br> <i>native
     * declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:74</i>
     */
    NativeLong EdsTerminateSDK();

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsRetain <br> // <br> // Description: <br> //
     * Increments the reference counter of existing objects. <br> // <br> //
     * Parameters: <br> // In: inRef - The reference for the item. <br> // Out:
     * None <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsUInt32 EdsRetain(EdsBaseRef)</code><br> <i>native
     * declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:99</i>
     */
    NativeLong EdsRetain(EdSdkLibrary.__EdsObject inRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsRelease <br> // <br> // Description: <br> //
     * Decrements the reference counter to an object. <br> // When the reference
     * counter reaches 0, the object is released. <br> // <br> // Parameters:
     * <br> // In: inRef - The reference of the item. <br> // Out: None <br> //
     * Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsUInt32 EdsRelease(EdsBaseRef)</code><br> <i>native
     * declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:115</i>
     */
    NativeLong EdsRelease(EdSdkLibrary.__EdsObject inRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetChildCount <br> // <br> // Description:
     * <br> // Gets the number of child objects of the designated object. <br>
     * // Example: Number of files in a directory <br> // <br> // Parameters:
     * <br> // In: inRef - The reference of the list. <br> // Out: outCount -
     * Number of elements in this list. <br> // <br> // Returns: Any of the sdk
     * errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetChildCount(EdsBaseRef, EdsUInt32*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:141</i>
     */
    NativeLong EdsGetChildCount(EdSdkLibrary.__EdsObject inRef, NativeLongByReference outCount);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetChildAtIndex <br> // <br> // Description:
     * <br> // Gets an indexed child object of the designated object. <br> //
     * <br> // Parameters: <br> // In: inRef - The reference of the item. <br>
     * // inIndex - The index that is passed in, is zero based. <br> // Out:
     * outRef - The pointer which receives reference of the <br> // specified
     * index . <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetChildAtIndex(EdsBaseRef, EdsInt32, EdsBaseRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:160</i><br>
     *
     * @deprecated use the safer method
     * {@link #EdsGetChildAtIndex(edsdk.EdSdkLibrary.__EdsObject, com.sun.jna.NativeLong, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsGetChildAtIndex(EdSdkLibrary.__EdsObject inRef, NativeLong inIndex, PointerByReference outRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetChildAtIndex <br> // <br> // Description:
     * <br> // Gets an indexed child object of the designated object. <br> //
     * <br> // Parameters: <br> // In: inRef - The reference of the item. <br>
     * // inIndex - The index that is passed in, is zero based. <br> // Out:
     * outRef - The pointer which receives reference of the <br> // specified
     * index . <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetChildAtIndex(EdsBaseRef, EdsInt32, EdsBaseRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:160</i>
     */
    NativeLong EdsGetChildAtIndex(EdSdkLibrary.__EdsObject inRef, NativeLong inIndex, EdSdkLibrary.__EdsObject outRef[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetParent <br> // <br> // Description: <br>
     * // Gets the parent object of the designated object. <br> // <br> //
     * Parameters: <br> // In: inRef - The reference of the item. <br> // Out:
     * outParentRef - The pointer which receives reference. <br> // <br> //
     * Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetParent(EdsBaseRef, EdsBaseRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:178</i><br>
     *
     * @deprecated use the safer method
     * {@link #EdsGetParent(edsdk.EdSdkLibrary.__EdsObject, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsGetParent(EdSdkLibrary.__EdsObject inRef, PointerByReference outParentRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetParent <br> // <br> // Description: <br>
     * // Gets the parent object of the designated object. <br> // <br> //
     * Parameters: <br> // In: inRef - The reference of the item. <br> // Out:
     * outParentRef - The pointer which receives reference. <br> // <br> //
     * Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetParent(EdsBaseRef, EdsBaseRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:178</i>
     */
    NativeLong EdsGetParent(EdSdkLibrary.__EdsObject inRef, EdSdkLibrary.__EdsObject outParentRef[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetPropertySize <br> // <br> // Description:
     * <br> // Gets the byte size and data type of a designated property <br> //
     * from a camera object or image object. <br> // <br> // Parameters: <br> //
     * In: inRef - The reference of the item. <br> // inPropertyID - The
     * ProprtyID <br> // inParam - Additional information of property. <br> //
     * We use this parameter in order to specify an index <br> // in case there
     * are two or more values over the same ID. <br> // Out: outDataType -
     * Pointer to the buffer that is to receive the property <br> // type data.
     * <br> // outSize - Pointer to the buffer that is to receive the property
     * <br> // size. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetPropertySize(EdsBaseRef, EdsPropertyID, EdsInt32, EdsDataType*, EdsUInt32*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:212</i><br>
     *
     * @deprecated use the safer methods
     * {@link #EdsGetPropertySize(edsdk.EdSdkLibrary.__EdsObject, com.sun.jna.NativeLong, com.sun.jna.NativeLong, java.nio.IntBuffer, com.sun.jna.ptr.NativeLongByReference)}
     * and
     * {@link #EdsGetPropertySize(edsdk.EdSdkLibrary.__EdsObject, com.sun.jna.NativeLong, com.sun.jna.NativeLong, com.sun.jna.ptr.IntByReference, com.sun.jna.ptr.NativeLongByReference)}
     * instead
     */
    @Deprecated
    NativeLong EdsGetPropertySize(EdSdkLibrary.__EdsObject inRef, NativeLong inPropertyID, NativeLong inParam, IntByReference outDataType, NativeLongByReference outSize);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetPropertySize <br> // <br> // Description:
     * <br> // Gets the byte size and data type of a designated property <br> //
     * from a camera object or image object. <br> // <br> // Parameters: <br> //
     * In: inRef - The reference of the item. <br> // inPropertyID - The
     * ProprtyID <br> // inParam - Additional information of property. <br> //
     * We use this parameter in order to specify an index <br> // in case there
     * are two or more values over the same ID. <br> // Out: outDataType -
     * Pointer to the buffer that is to receive the property <br> // type data.
     * <br> // outSize - Pointer to the buffer that is to receive the property
     * <br> // size. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetPropertySize(EdsBaseRef, EdsPropertyID, EdsInt32, EdsDataType*, EdsUInt32*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:212</i>
     */
    NativeLong EdsGetPropertySize(EdSdkLibrary.__EdsObject inRef, NativeLong inPropertyID, NativeLong inParam, IntBuffer outDataType, NativeLongByReference outSize);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetPropertyData <br> // <br> // Description:
     * <br> // Gets property information from the object designated in inRef.
     * <br> // <br> // Parameters: <br> // In: inRef - The reference of the
     * item. <br> // inPropertyID - The ProprtyID <br> // inParam - Additional
     * information of property. <br> // We use this parameter in order to
     * specify an index <br> // in case there are two or more values over the
     * same ID. <br> // inPropertySize - The number of bytes of the prepared
     * buffer <br> // for receive property-value. <br> // Out: outPropertyData -
     * The buffer pointer to receive property-value. <br> // <br> // Returns:
     * Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetPropertyData(EdsBaseRef, EdsPropertyID, EdsInt32, EdsUInt32, EdsVoid*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:238</i>
     */
    NativeLong EdsGetPropertyData(EdSdkLibrary.__EdsObject inRef, NativeLong inPropertyID, NativeLong inParam, NativeLong inPropertySize, EdSdkLibrary.EdsVoid outPropertyData);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSetPropertyData <br> // <br> // Description:
     * <br> // Sets property data for the object designated in inRef. <br> //
     * <br> // Parameters: <br> // In: inRef - The reference of the item. <br>
     * // inPropertyID - The ProprtyID <br> // inParam - Additional information
     * of property. <br> // inPropertySize - The number of bytes of the prepared
     * buffer <br> // for set property-value. <br> // inPropertyData - The
     * buffer pointer to set property-value. <br> // Out: None <br> // <br> //
     * Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSetPropertyData(EdsBaseRef, EdsPropertyID, EdsInt32, EdsUInt32, const EdsVoid*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:263</i>
     */
    NativeLong EdsSetPropertyData(EdSdkLibrary.__EdsObject inRef, NativeLong inPropertyID, NativeLong inParam, NativeLong inPropertySize, EdSdkLibrary.EdsVoid inPropertyData);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetPropertyDesc <br> // <br> // Description:
     * <br> // Gets a list of property data that can be set for the object <br>
     * // designated in inRef, as well as maximum and minimum values. <br> //
     * This API is intended for only some shooting-related properties. <br> //
     * <br> // Parameters: <br> // In: inRef - The reference of the camera. <br>
     * // inPropertyID - The Property ID. <br> // Out: outPropertyDesc - Array
     * of the value which can be set up. <br> // <br> // Returns: Any of the sdk
     * errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetPropertyDesc(EdsBaseRef, EdsPropertyID, EdsPropertyDesc*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:286</i>
     */
    NativeLong EdsGetPropertyDesc(EdSdkLibrary.__EdsObject inRef, NativeLong inPropertyID, EdsPropertyDesc outPropertyDesc);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetCameraList <br> // <br> // Description:
     * <br> // Gets camera list objects. <br> // <br> // Parameters: <br> // In:
     * None <br> // Out: outCameraListRef - Pointer to the camera-list. <br> //
     * <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetCameraList(EdsCameraListRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:313</i><br>
     *
     * @deprecated use the safer method
     * {@link #EdsGetCameraList(edsdk.EdSdkLibrary.__EdsObject[])} instead
     */
    @Deprecated
    NativeLong EdsGetCameraList(PointerByReference outCameraListRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetCameraList <br> // <br> // Description:
     * <br> // Gets camera list objects. <br> // <br> // Parameters: <br> // In:
     * None <br> // Out: outCameraListRef - Pointer to the camera-list. <br> //
     * <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetCameraList(EdsCameraListRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:313</i>
     */
    NativeLong EdsGetCameraList(EdSdkLibrary.__EdsObject outCameraListRef[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetDeviceInfo <br> // <br> // Description:
     * <br> // Gets device information, such as the device name. <br> // Because
     * device information of remote cameras is stored <br> // on the host
     * computer, you can use this API <br> // before the camera object initiates
     * communication <br> // (that is, before a session is opened). <br> // <br>
     * // Parameters: <br> // In: inCameraRef - The reference of the camera.
     * <br> // Out: outDeviceInfo - Information as device of camera. <br> //
     * <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetDeviceInfo(EdsCameraRef, EdsDeviceInfo*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:342</i>
     */
    NativeLong EdsGetDeviceInfo(EdSdkLibrary.__EdsObject inCameraRef, EdsDeviceInfo outDeviceInfo);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsOpenSession <br> // <br> // Description:
     * <br> // Establishes a logical connection with a remote camera. <br> //
     * Use this API after getting the camera's EdsCamera object. <br> // <br> //
     * Parameters: <br> // In: inCameraRef - The reference of the camera <br> //
     * Out: None <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsOpenSession(EdsCameraRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:360</i>
     */
    NativeLong EdsOpenSession(EdSdkLibrary.__EdsObject inCameraRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCloseSession <br> // <br> // Description:
     * <br> // Closes a logical connection with a remote camera. <br> // <br> //
     * Parameters: <br> // In: inCameraRef - The reference of the camera <br> //
     * Out: None <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCloseSession(EdsCameraRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:376</i>
     */
    NativeLong EdsCloseSession(EdSdkLibrary.__EdsObject inCameraRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSendCommand <br> // <br> // Description:
     * <br> // Sends a command such as "Shoot" to a remote camera. <br> // <br>
     * // Parameters: <br> // In: inCameraRef - The reference of the camera
     * which will receive the <br> // command. <br> // inCommand - Specifies the
     * command to be sent. <br> // inParam - Specifies additional
     * command-specific information. <br> // Out: None <br> // <br> // Returns:
     * Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSendCommand(EdsCameraRef, EdsCameraCommand, EdsInt32)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:395</i>
     */
    NativeLong EdsSendCommand(EdSdkLibrary.__EdsObject inCameraRef, NativeLong inCommand, NativeLong inParam);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSendStatusCommand <br> // <br> //
     * Description: <br> // Sets the remote camera state or mode. <br> // <br>
     * // Parameters: <br> // In: inCameraRef - The reference of the camera
     * which will receive the <br> // command. <br> // inStatusCommand -
     * Specifies the command to be sent. <br> // inParam - Specifies additional
     * command-specific information. <br> // Out: None <br> // <br> // Returns:
     * Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSendStatusCommand(EdsCameraRef, EdsCameraStatusCommand, EdsInt32)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:416</i>
     */
    NativeLong EdsSendStatusCommand(EdSdkLibrary.__EdsObject inCameraRef, NativeLong inStatusCommand, NativeLong inParam);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSetCapacity <br> // <br> // Description:
     * <br> // Sets the remaining HDD capacity on the host computer <br> //
     * (excluding the portion from image transfer), <br> // as calculated by
     * subtracting the portion from the previous time. <br> // Set a reset flag
     * initially and designate the cluster length <br> // and number of free
     * clusters. <br> // Some type 2 protocol standard cameras can display the
     * number of shots <br> // left on the camera based on the available disk
     * capacity <br> // of the host computer. <br> // For these cameras, after
     * the storage destination is set to the computer, <br> // use this API to
     * notify the camera of the available disk capacity <br> // of the host
     * computer. <br> // <br> // Parameters: <br> // In: inCameraRef - The
     * reference of the camera which will receive the <br> // command. <br> //
     * inCapacity - The remaining capacity of a transmission place. <br> // Out:
     * None <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSetCapacity(EdsCameraRef, EdsCapacity)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:447</i>
     */
    NativeLong EdsSetCapacity(EdSdkLibrary.__EdsObject inCameraRef, edsdk.a.EdsCapacity.ByValue inCapacity);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetVolumeInfo <br> // <br> // Description:
     * <br> // Gets volume information for a memory card in the camera. <br> //
     * <br> // Parameters: <br> // In: inVolumeRef - The reference of the
     * volume. <br> // Out: outVolumeInfo - information of the volume. <br> //
     * <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetVolumeInfo(EdsVolumeRef, EdsVolumeInfo*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:473</i>
     */
    NativeLong EdsGetVolumeInfo(EdSdkLibrary.__EdsObject inVolumeRef, EdsVolumeInfo outVolumeInfo);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsFormatVolume <br> // <br> // Description:
     * <br> // Formats volumes of memory cards in a camera. <br> // <br> //
     * Parameters: <br> // In: inVolumeRef - The reference of volume . <br> //
     * <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsFormatVolume(EdsVolumeRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:489</i>
     */
    NativeLong EdsFormatVolume(EdSdkLibrary.__EdsObject inVolumeRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetDirectoryItemInfo <br> // <br> //
     * Description: <br> // Gets information about the directory or file objects
     * <br> // on the memory card (volume) in a remote camera. <br> // <br> //
     * Parameters: <br> // In: inDirItemRef - The reference of the directory
     * item. <br> // Out: outDirItemInfo - information of the directory item.
     * <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetDirectoryItemInfo(EdsDirectoryItemRef, EdsDirectoryItemInfo*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:515</i>
     */
    NativeLong EdsGetDirectoryItemInfo(EdSdkLibrary.__EdsObject inDirItemRef, EdsDirectoryItemInfo outDirItemInfo);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsDeleteDirectoryItem <br> // <br> //
     * Description: <br> // Deletes a camera folder or file. <br> // If folders
     * with subdirectories are designated, all files are deleted <br> // except
     * protected files. <br> // EdsDirectoryItem objects deleted by means of
     * this API are implicitly <br> // released by the EDSDK. Thus, there is no
     * need to release them <br> // by means of EdsRelease. <br> // <br> //
     * Parameters: <br> // In: inDirItemRef - The reference of the directory
     * item. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsDeleteDirectoryItem(EdsDirectoryItemRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:537</i>
     */
    NativeLong EdsDeleteDirectoryItem(EdSdkLibrary.__EdsObject inDirItemRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsDownload <br> // <br> // Description: <br>
     * // Downloads a file on a remote camera <br> // (in the camera memory or
     * on a memory card) to the host computer. <br> // The downloaded file is
     * sent directly to a file stream created in advance. <br> // When dividing
     * the file being retrieved, call this API repeatedly. <br> // Also in this
     * case, make the data block size a multiple of 512 (bytes), <br> //
     * excluding the final block. <br> // <br> // Parameters: <br> // In:
     * inDirItemRef - The reference of the directory item. <br> // inReadSize -
     * <br> // <br> // Out: outStream - The reference of the stream. <br> //
     * <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsDownload(EdsDirectoryItemRef, EdsUInt32, EdsStreamRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:560</i>
     */
    NativeLong EdsDownload(EdSdkLibrary.__EdsObject inDirItemRef, NativeLong inReadSize, EdSdkLibrary.__EdsObject outStream);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsDownloadCancel <br> // <br> // Description:
     * <br> // Must be executed when downloading of a directory item is
     * canceled. <br> // Calling this API makes the camera cancel file
     * transmission. <br> // It also releases resources. <br> // This operation
     * need not be executed when using EdsDownloadThumbnail. <br> // <br> //
     * Parameters: <br> // In: inDirItemRef - The reference of the directory
     * item. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsDownloadCancel(EdsDirectoryItemRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:580</i>
     */
    NativeLong EdsDownloadCancel(EdSdkLibrary.__EdsObject inDirItemRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsDownloadComplete <br> // <br> //
     * Description: <br> // Must be called when downloading of directory items
     * is complete. <br> // Executing this API makes the camera <br> //
     * recognize that file transmission is complete. <br> // This operation need
     * not be executed when using EdsDownloadThumbnail. <br> // <br> //
     * Parameters: <br> // In: inDirItemRef - The reference of the directory
     * item. <br> // <br> // Out: outStream - None. <br> // <br> // Returns: Any
     * of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsDownloadComplete(EdsDirectoryItemRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:600</i>
     */
    NativeLong EdsDownloadComplete(EdSdkLibrary.__EdsObject inDirItemRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsDownloadThumbnail <br> // <br> //
     * Description: <br> // Extracts and downloads thumbnail information from
     * image files in a camera. <br> // Thumbnail information in the camera's
     * image files is downloaded <br> // to the host computer. <br> //
     * Downloaded thumbnails are sent directly to a file stream created in
     * advance. <br> // <br> // Parameters: <br> // In: inDirItemRef - The
     * reference of the directory item. <br> // <br> // Out: outStream - The
     * reference of the stream. <br> // <br> // Returns: Any of the sdk errors.
     * <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsDownloadThumbnail(EdsDirectoryItemRef, EdsStreamRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:620</i>
     */
    NativeLong EdsDownloadThumbnail(EdSdkLibrary.__EdsObject inDirItemRef, EdSdkLibrary.__EdsObject outStream);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetAttribute <br> // <br> // Description:
     * <br> // Gets attributes of files on a camera. <br> // <br> // Parameters:
     * <br> // In: inDirItemRef - The reference of the directory item. <br> //
     * Out: outFileAttribute - Indicates the file attributes. <br> // As for the
     * file attributes, OR values of the value defined <br> // by enum
     * EdsFileAttributes can be retrieved. Thus, when <br> // determining the
     * file attributes, you must check <br> // if an attribute flag is set for
     * target attributes. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetAttribute(EdsDirectoryItemRef, EdsFileAttributes*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:641</i><br>
     *
     * @deprecated use the safer methods
     * {@link #EdsGetAttribute(edsdk.EdSdkLibrary.__EdsObject, java.nio.IntBuffer)}
     * and
     * {@link #EdsGetAttribute(edsdk.EdSdkLibrary.__EdsObject, com.sun.jna.ptr.IntByReference)}
     * instead
     */
    @Deprecated
    NativeLong EdsGetAttribute(EdSdkLibrary.__EdsObject inDirItemRef, IntByReference outFileAttribute);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetAttribute <br> // <br> // Description:
     * <br> // Gets attributes of files on a camera. <br> // <br> // Parameters:
     * <br> // In: inDirItemRef - The reference of the directory item. <br> //
     * Out: outFileAttribute - Indicates the file attributes. <br> // As for the
     * file attributes, OR values of the value defined <br> // by enum
     * EdsFileAttributes can be retrieved. Thus, when <br> // determining the
     * file attributes, you must check <br> // if an attribute flag is set for
     * target attributes. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetAttribute(EdsDirectoryItemRef, EdsFileAttributes*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:641</i>
     */
    NativeLong EdsGetAttribute(EdSdkLibrary.__EdsObject inDirItemRef, IntBuffer outFileAttribute);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSetAttribute <br> // <br> // Description:
     * <br> // Changes attributes of files on a camera. <br> // <br> //
     * Parameters: <br> // In: inDirItemRef - The reference of the directory
     * item. <br> // inFileAttribute - Indicates the file attributes. <br> // As
     * for the file attributes, OR values of the value <br> // defined by enum
     * EdsFileAttributes can be retrieved. <br> // Out: None <br> // <br> //
     * Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSetAttribute(EdsDirectoryItemRef, EdsFileAttributes)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:661</i>
     */
    NativeLong EdsSetAttribute(EdSdkLibrary.__EdsObject inDirItemRef, int inFileAttribute);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateFileStream <br> // <br> //
     * Description: <br> // Creates a new file on a host computer (or opens an
     * existing file) <br> // and creates a file stream for access to the file.
     * <br> // If a new file is designated before executing this API, <br> //
     * the file is actually created following the timing of writing <br> // by
     * means of EdsWrite or the like with respect to an open stream. <br> //
     * <br> // Parameters: <br> // In: inFileName - Pointer to a null-terminated
     * string that specifies <br> // the file name. <br> // inCreateDisposition
     * - Action to take on files that exist, <br> // and which action to take
     * when files do not exist. <br> // inDesiredAccess - Access to the stream
     * (reading, writing, or both). <br> // Out: outStream - The reference of
     * the stream. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateFileStream(const EdsChar*, EdsFileCreateDisposition, EdsAccess, EdsStreamRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:696</i><br>
     *
     * @deprecated use the safer methods
     * {@link #EdsCreateFileStream(java.nio.ByteBuffer, int, int, edsdk.EdSdkLibrary.__EdsObject[])}
     * and
     * {@link #EdsCreateFileStream(com.sun.jna.Pointer, int, int, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsCreateFileStream(Pointer inFileName, int inCreateDisposition, int inDesiredAccess, PointerByReference outStream);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateFileStream <br> // <br> //
     * Description: <br> // Creates a new file on a host computer (or opens an
     * existing file) <br> // and creates a file stream for access to the file.
     * <br> // If a new file is designated before executing this API, <br> //
     * the file is actually created following the timing of writing <br> // by
     * means of EdsWrite or the like with respect to an open stream. <br> //
     * <br> // Parameters: <br> // In: inFileName - Pointer to a null-terminated
     * string that specifies <br> // the file name. <br> // inCreateDisposition
     * - Action to take on files that exist, <br> // and which action to take
     * when files do not exist. <br> // inDesiredAccess - Access to the stream
     * (reading, writing, or both). <br> // Out: outStream - The reference of
     * the stream. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateFileStream(const EdsChar*, EdsFileCreateDisposition, EdsAccess, EdsStreamRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:696</i>
     */
    NativeLong EdsCreateFileStream(ByteBuffer inFileName, int inCreateDisposition, int inDesiredAccess, EdSdkLibrary.__EdsObject outStream[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateFileStream <br> // <br> //
     * Description: <br> // Creates a new file on a host computer (or opens an
     * existing file) <br> // and creates a file stream for access to the file.
     * <br> // If a new file is designated before executing this API, <br> //
     * the file is actually created following the timing of writing <br> // by
     * means of EdsWrite or the like with respect to an open stream. <br> //
     * <br> // Parameters: <br> // In: inFileName - Pointer to a null-terminated
     * string that specifies <br> // the file name. <br> // inCreateDisposition
     * - Action to take on files that exist, <br> // and which action to take
     * when files do not exist. <br> // inDesiredAccess - Access to the stream
     * (reading, writing, or both). <br> // Out: outStream - The reference of
     * the stream. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateFileStream(const EdsChar*, EdsFileCreateDisposition, EdsAccess, EdsStreamRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:696</i>
     */
    NativeLong EdsCreateFileStream(Pointer inFileName, int inCreateDisposition, int inDesiredAccess, EdSdkLibrary.__EdsObject outStream[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateMemoryStream <br> // <br> //
     * Description: <br> // Creates a stream in the memory of a host computer.
     * <br> // In the case of writing in excess of the allocated buffer size,
     * <br> // the memory is automatically extended. <br> // <br> // Parameters:
     * <br> // In: inBufferSize - The number of bytes of the memory to allocate.
     * <br> // Out: outStream - The reference of the stream. <br> // <br> //
     * Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateMemoryStream(EdsUInt32, EdsStreamRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:718</i><br>
     *
     * @deprecated use the safer method
     * {@link #EdsCreateMemoryStream(com.sun.jna.NativeLong, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsCreateMemoryStream(NativeLong inBufferSize, PointerByReference outStream);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateMemoryStream <br> // <br> //
     * Description: <br> // Creates a stream in the memory of a host computer.
     * <br> // In the case of writing in excess of the allocated buffer size,
     * <br> // the memory is automatically extended. <br> // <br> // Parameters:
     * <br> // In: inBufferSize - The number of bytes of the memory to allocate.
     * <br> // Out: outStream - The reference of the stream. <br> // <br> //
     * Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateMemoryStream(EdsUInt32, EdsStreamRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:718</i>
     */
    NativeLong EdsCreateMemoryStream(NativeLong inBufferSize, EdSdkLibrary.__EdsObject outStream[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateStreamEx <br> // <br> // Description:
     * <br> // An extended version of EdsCreateStreamFromFile. <br> // Use this
     * function when working with Unicode file names. <br> // <br> //
     * Parameters: <br> // In: inURL (for Macintosh) - Designate CFURLRef. <br>
     * // inFileName (for Windows) - Designate the file name. <br> //
     * inCreateDisposition - Action to take on files that exist, <br> // and
     * which action to take when files do not exist. <br> // inDesiredAccess -
     * Access to the stream (reading, writing, or both). <br> // <br> // Out:
     * outStream - The reference of the stream. <br> // <br> // Returns: Any of
     * the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateFileStreamEx(const WCHAR*, EdsFileCreateDisposition, EdsAccess, EdsStreamRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:742</i><br>
     *
     * @deprecated use the safer methods
     * {@link #EdsCreateFileStreamEx(short[], int, int, edsdk.EdSdkLibrary.__EdsObject[])}
     * and
     * {@link #EdsCreateFileStreamEx(com.sun.jna.ptr.ShortByReference, int, int, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsCreateFileStreamEx(ShortByReference inFileName, int inCreateDisposition, int inDesiredAccess, PointerByReference outStream);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateStreamEx <br> // <br> // Description:
     * <br> // An extended version of EdsCreateStreamFromFile. <br> // Use this
     * function when working with Unicode file names. <br> // <br> //
     * Parameters: <br> // In: inURL (for Macintosh) - Designate CFURLRef. <br>
     * // inFileName (for Windows) - Designate the file name. <br> //
     * inCreateDisposition - Action to take on files that exist, <br> // and
     * which action to take when files do not exist. <br> // inDesiredAccess -
     * Access to the stream (reading, writing, or both). <br> // <br> // Out:
     * outStream - The reference of the stream. <br> // <br> // Returns: Any of
     * the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateFileStreamEx(const WCHAR*, EdsFileCreateDisposition, EdsAccess, EdsStreamRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:742</i>
     */
    NativeLong EdsCreateFileStreamEx(short inFileName[], int inCreateDisposition, int inDesiredAccess, EdSdkLibrary.__EdsObject outStream[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateStreamEx <br> // <br> // Description:
     * <br> // An extended version of EdsCreateStreamFromFile. <br> // Use this
     * function when working with Unicode file names. <br> // <br> //
     * Parameters: <br> // In: inURL (for Macintosh) - Designate CFURLRef. <br>
     * // inFileName (for Windows) - Designate the file name. <br> //
     * inCreateDisposition - Action to take on files that exist, <br> // and
     * which action to take when files do not exist. <br> // inDesiredAccess -
     * Access to the stream (reading, writing, or both). <br> // <br> // Out:
     * outStream - The reference of the stream. <br> // <br> // Returns: Any of
     * the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateFileStreamEx(const WCHAR*, EdsFileCreateDisposition, EdsAccess, EdsStreamRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:742</i>
     */
    NativeLong EdsCreateFileStreamEx(ShortByReference inFileName, int inCreateDisposition, int inDesiredAccess, EdSdkLibrary.__EdsObject outStream[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateMemoryStreamFromPointer <br> // <br>
     * // Description: <br> // Creates a stream from the memory buffer you
     * prepare. <br> // Unlike the buffer size of streams created by means of
     * EdsCreateMemoryStream, <br> // the buffer size you prepare for streams
     * created this way does not expand. <br> // <br> // Parameters: <br> // In:
     * inUserBuffer - Pointer to the buffer you have prepared. <br> // Streams
     * created by means of this API lead to this buffer. <br> // inBufferSize -
     * The number of bytes of the memory to allocate. <br> // Out: outStream -
     * The reference of the stream. <br> // <br> // Returns: Any of the sdk
     * errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateMemoryStreamFromPointer(EdsVoid*, EdsUInt32, EdsStreamRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:770</i><br>
     *
     * @deprecated use the safer method
     * {@link #EdsCreateMemoryStreamFromPointer(edsdk.EdSdkLibrary.EdsVoid, com.sun.jna.NativeLong, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsCreateMemoryStreamFromPointer(EdSdkLibrary.EdsVoid inUserBuffer, NativeLong inBufferSize, PointerByReference outStream);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateMemoryStreamFromPointer <br> // <br>
     * // Description: <br> // Creates a stream from the memory buffer you
     * prepare. <br> // Unlike the buffer size of streams created by means of
     * EdsCreateMemoryStream, <br> // the buffer size you prepare for streams
     * created this way does not expand. <br> // <br> // Parameters: <br> // In:
     * inUserBuffer - Pointer to the buffer you have prepared. <br> // Streams
     * created by means of this API lead to this buffer. <br> // inBufferSize -
     * The number of bytes of the memory to allocate. <br> // Out: outStream -
     * The reference of the stream. <br> // <br> // Returns: Any of the sdk
     * errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateMemoryStreamFromPointer(EdsVoid*, EdsUInt32, EdsStreamRef*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:770</i>
     */
    NativeLong EdsCreateMemoryStreamFromPointer(EdSdkLibrary.EdsVoid inUserBuffer, NativeLong inBufferSize, EdSdkLibrary.__EdsObject outStream[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetPointer <br> // <br> // Description: <br>
     * // Gets the pointer to the start address of memory managed by the memory
     * stream. <br> // As the EDSDK automatically resizes the buffer, the memory
     * stream provides <br> // you with the same access methods as for the file
     * stream. <br> // If access is attempted that is excessive with regard to
     * the buffer size <br> // for the stream, data before the required buffer
     * size is allocated <br> // is copied internally, and new writing occurs.
     * <br> // Thus, the buffer pointer might be switched on an unknown timing.
     * <br> // Caution in use is therefore advised. <br> // <br> // Parameters:
     * <br> // In: inStream - Designate the memory stream for the pointer to
     * retrieve. <br> // Out: outPointer - If successful, returns the pointer to
     * the buffer <br> // written in the memory stream. <br> // <br> // Returns:
     * Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetPointer(EdsStreamRef, EdsVoid**)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:797</i>
     */
    NativeLong EdsGetPointer(EdSdkLibrary.__EdsObject inStream, PointerByReference outPointer);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsRead <br> // <br> // Description: <br> //
     * Reads data the size of inReadSize into the outBuffer buffer, <br> //
     * starting at the current read or write position of the stream. <br> // The
     * size of data actually read can be designated in outReadSize. <br> // <br>
     * // Parameters: <br> // In: inStreamRef - The reference of the stream or
     * image. <br> // inReadSize - The number of bytes to read. <br> // Out:
     * outBuffer - Pointer to the user-supplied buffer that is to receive <br>
     * // the data read from the stream. <br> // outReadSize - The actually read
     * number of bytes. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsRead(EdsStreamRef, EdsUInt32, EdsVoid*, EdsUInt32*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:820</i>
     */
    NativeLong EdsRead(EdSdkLibrary.__EdsObject inStreamRef, NativeLong inReadSize, EdSdkLibrary.EdsVoid outBuffer, NativeLongByReference outReadSize);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsWrite <br> // <br> // Description: <br> //
     * Writes data of a designated buffer <br> // to the current read or write
     * position of the stream. <br> // <br> // Parameters: <br> // In:
     * inStreamRef - The reference of the stream or image. <br> // inWriteSize -
     * The number of bytes to write. <br> // inBuffer - A pointer to the
     * user-supplied buffer that contains <br> // the data to be written to the
     * stream. <br> // Out: outWrittenSize - The actually written-in number of
     * bytes. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsWrite(EdsStreamRef, EdsUInt32, const EdsVoid*, EdsUInt32*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:844</i>
     */
    NativeLong EdsWrite(EdSdkLibrary.__EdsObject inStreamRef, NativeLong inWriteSize, EdSdkLibrary.EdsVoid inBuffer, NativeLongByReference outWrittenSize);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSeek <br> // <br> // Description: <br> //
     * Moves the read or write position of the stream <br> (that is, the file
     * position indicator). <br> // <br> // Parameters: <br> // In: inStreamRef
     * - The reference of the stream or image. <br> // inSeekOffset - Number of
     * bytes to move the pointer. <br> // inSeekOrigin - Pointer movement mode.
     * Must be one of the following <br> // values. <br> // kEdsSeek_Cur Move
     * the stream pointer inSeekOffset bytes <br> // from the current position
     * in the stream. <br> // kEdsSeek_Begin Move the stream pointer
     * inSeekOffset bytes <br> // forward from the beginning of the stream. <br>
     * // kEdsSeek_End Move the stream pointer inSeekOffset bytes <br> // from
     * the end of the stream. <br> // <br> // Returns: Any of the sdk errors.
     * <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSeek(EdsStreamRef, EdsInt32, EdsSeekOrigin)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:873</i>
     */
    NativeLong EdsSeek(EdSdkLibrary.__EdsObject inStreamRef, NativeLong inSeekOffset, int inSeekOrigin);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetPosition <br> // <br> // Description:
     * <br> // Gets the current read or write position of the stream <br> //
     * (that is, the file position indicator). <br> // <br> // Parameters: <br>
     * // In: inStreamRef - The reference of the stream or image. <br> // Out:
     * outPosition - The current stream pointer. <br> // <br> // Returns: Any of
     * the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetPosition(EdsStreamRef, EdsUInt32*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:893</i>
     */
    NativeLong EdsGetPosition(EdSdkLibrary.__EdsObject inStreamRef, NativeLongByReference outPosition);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetLength <br> // <br> // Description: <br>
     * // Gets the stream size. <br> // <br> // Parameters: <br> // In:
     * inStreamRef - The reference of the stream or image. <br> // Out:
     * outLength - The length of the stream. <br> // <br> // Returns: Any of the
     * sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetLength(EdsStreamRef, EdsUInt32*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:911</i>
     */
    NativeLong EdsGetLength(EdSdkLibrary.__EdsObject inStreamRef, NativeLongByReference outLength);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCopyData <br> // <br> // Description: <br>
     * // Copies data from the copy source stream to the copy destination
     * stream. <br> // The read or write position of the data to copy is
     * determined from <br> // the current file read or write position of the
     * respective stream. <br> // After this API is executed, the read or write
     * positions of the copy source <br> // and copy destination streams are
     * moved an amount corresponding to <br> // inWriteSize in the positive
     * direction. <br> // <br> // Parameters: <br> // In: inStreamRef - The
     * reference of the stream or image. <br> // inWriteSize - The number of
     * bytes to copy. <br> // Out: outStreamRef - The reference of the stream or
     * image. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCopyData(EdsStreamRef, EdsUInt32, EdsStreamRef)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:935</i>
     */
    NativeLong EdsCopyData(EdSdkLibrary.__EdsObject inStreamRef, NativeLong inWriteSize, EdSdkLibrary.__EdsObject outStreamRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSetProgressCallback <br> // <br> //
     * Description: <br> // Register a progress callback function. <br> // An
     * event is received as notification of progress during processing that <br>
     * // takes a relatively long time, such as downloading files from a <br> //
     * remote camera. <br> // If you register the callback function, the EDSDK
     * calls the callback <br> // function during execution or on completion of
     * the following APIs. <br> // This timing can be used in updating on-screen
     * progress bars, for example. <br> // <br> // Parameters: <br> // In: inRef
     * - The reference of the stream or image. <br> // inProgressCallback -
     * Pointer to a progress callback function. <br> // inProgressOption - The
     * option about progress is specified. <br> // Must be one of the following
     * values. <br> // kEdsProgressOption_Done <br> // When processing is
     * completed,a callback function <br> // is called only at once. <br> //
     * kEdsProgressOption_Periodically <br> // A callback function is performed
     * periodically. <br> // inContext - Application information, passed in the
     * argument <br> // when the callback function is called. Any information
     * <br> // required for your program may be added. <br> // Out: None <br> //
     * <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSetProgressCallback(EdsBaseRef, EdsProgressCallback, EdsProgressOption, EdsVoid*)</code><br>
     * <i>native declaration : canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:971</i>
     */
    NativeLong EdsSetProgressCallback(EdSdkLibrary.__EdsObject inRef, EdSdkLibrary.EdsProgressCallback inProgressCallback, int inProgressOption, EdSdkLibrary.EdsVoid inContext);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateImageRef <br> // <br> // Description:
     * <br> // Creates an image object from an image file. <br> // Without
     * modification, stream objects cannot be worked with as images. <br> //
     * Thus, when extracting images from image files, <br> // you must use this
     * API to create image objects. <br> // The image object created this way
     * can be used to get image information <br> // (such as the height and
     * width, number of color components, and <br> // resolution), thumbnail
     * image data, and the image data itself. <br> // <br> // Parameters: <br>
     * // In: inStreamRef - The reference of the stream. <br> // <br> // Out:
     * outImageRef - The reference of the image. <br> // <br> // Returns: Any of
     * the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateImageRef(EdsStreamRef, EdsImageRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1007</i><br>
     *
     * @deprecated use the safer method
     * {@link #EdsCreateImageRef(edsdk.EdSdkLibrary.__EdsObject, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsCreateImageRef(EdSdkLibrary.__EdsObject inStreamRef, PointerByReference outImageRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateImageRef <br> // <br> // Description:
     * <br> // Creates an image object from an image file. <br> // Without
     * modification, stream objects cannot be worked with as images. <br> //
     * Thus, when extracting images from image files, <br> // you must use this
     * API to create image objects. <br> // The image object created this way
     * can be used to get image information <br> // (such as the height and
     * width, number of color components, and <br> // resolution), thumbnail
     * image data, and the image data itself. <br> // <br> // Parameters: <br>
     * // In: inStreamRef - The reference of the stream. <br> // <br> // Out:
     * outImageRef - The reference of the image. <br> // <br> // Returns: Any of
     * the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateImageRef(EdsStreamRef, EdsImageRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1007</i>
     */
    NativeLong EdsCreateImageRef(EdSdkLibrary.__EdsObject inStreamRef, EdSdkLibrary.__EdsObject outImageRef[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetImageInfo <br> // <br> // Description:
     * <br> // Gets image information from a designated image object. <br> //
     * Here, image information means the image width and height, <br> // number
     * of color components, resolution, and effective image area. <br> // <br>
     * // Parameters: <br> // In: inStreamRef - Designate the object for which
     * to get image information. <br> // inImageSource - Of the various image
     * data items in the image file, <br> // designate the type of image data
     * representing the <br> // information you want to get. Designate the image
     * as <br> // defined in Enum EdsImageSource. <br> // <br> //
     * kEdsImageSrc_FullView <br> // The image itself (a full-sized image) <br>
     * // kEdsImageSrc_Thumbnail <br> // A thumbnail image <br> //
     * kEdsImageSrc_Preview <br> // A preview image <br> //
     * kEdsImageSrc_RAWThumbnail <br> // A RAW thumbnail image <br> //
     * kEdsImageSrc_RAWFullView <br> // A RAW full-sized image <br> // Out:
     * outImageInfo - Stores the image data information designated <br> // in
     * inImageSource. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetImageInfo(EdsImageRef, EdsImageSource, EdsImageInfo*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1042</i>
     */
    NativeLong EdsGetImageInfo(EdSdkLibrary.__EdsObject inImageRef, int inImageSource, EdsImageInfo outImageInfo);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetImage <br> // <br> // Description: <br>
     * // Gets designated image data from an image file, in the form of a <br>
     * // designated rectangle. <br> // Returns uncompressed results for JPEGs
     * and processed results <br> // in the designated pixel order (RGB,
     * Top-down BGR, and so on) for <br> // RAW images. <br> // Additionally, by
     * designating the input/output rectangle, <br> // it is possible to get
     * reduced, enlarged, or partial images. <br> // However, because images
     * corresponding to the designated output rectangle <br> // are always
     * returned by the SDK, the SDK does not take the aspect <br> // ratio into
     * account. <br> // To maintain the aspect ratio, you must keep the aspect
     * ratio in mind <br> // when designating the rectangle. <br> // <br> //
     * Parameters: <br> // In: <br> // inImageRef - Designate the image object
     * for which to get <br> // the image data. <br> // inImageSource -
     * Designate the type of image data to get from <br> // the image file
     * (thumbnail, preview, and so on). <br> // Designate values as defined in
     * Enum EdsImageSource. <br> // inImageType - Designate the output image
     * type. Because <br> // the output format of EdGetImage may only be RGB,
     * only <br> // kEdsTargetImageType_RGB or kEdsTargetImageType_RGB16 <br> //
     * can be designated. <br> // However, image types exceeding the resolution
     * of <br> // inImageSource cannot be designated. <br> // inSrcRect -
     * Designate the coordinates and size of the rectangle <br> // to be
     * retrieved (processed) from the source image. <br> // inDstSize -
     * Designate the rectangle size for output. <br> // <br> // Out: <br> //
     * outStreamRef - Designate the memory or file stream for output of <br> //
     * the image. <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetImage(EdsImageRef, EdsImageSource, EdsTargetImageType, EdsRect, EdsSize, EdsStreamRef)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1087</i>
     */
    NativeLong EdsGetImage(EdSdkLibrary.__EdsObject inImageRef, int inImageSource, int inImageType, edsdk.a.EdsRect.ByValue inSrcRect, edsdk.a.EdsSize.ByValue inDstSize, EdSdkLibrary.__EdsObject outStreamRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSaveImage <br> // <br> // Description: <br>
     * // Saves as a designated image type after RAW processing. <br> // When
     * saving with JPEG compression, <br> // the JPEG quality setting applies
     * with respect to EdsOptionRef. <br> // <br> // Parameters: <br> // In:
     * <br> // inImageRef - Designate the image object for which to produce the
     * file. <br> // inImageType - Designate the image type to produce.
     * Designate the <br> // following image types. <br> // <br> //
     * kEdsTargetImageType - Jpeg JPEG <br> // kEdsTargetImageType - TIFF 8-bit
     * TIFF <br> // kEdsTargetImageType - TIFF16 16-bit TIFF <br> //
     * inSaveSetting - Designate saving options, such as JPEG image quality.
     * <br> // Out: <br> // outStreamRef - Specifies the output file stream. The
     * memory stream <br> // cannot be specified here. <br> // Returns: Any of
     * the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSaveImage(EdsImageRef, EdsTargetImageType, EdsSaveImageSetting, EdsStreamRef)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1120</i>
     */
    NativeLong EdsSaveImage(EdSdkLibrary.__EdsObject inImageRef, int inImageType, edsdk.a.EdsSaveImageSetting.ByValue inSaveSetting, EdSdkLibrary.__EdsObject outStreamRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCacheImage <br> // <br> // Description: <br>
     * // Switches a setting on and off for creation of an image cache in the
     * SDK <br> // for a designated image object during extraction (processing)
     * of <br> // the image data. <br> // Creating the cache increases the
     * processing speed, starting from <br> // the second time. <br> // <br> //
     * Parameters: <br> // In: inImageRef - The reference of the image. <br> //
     * inUseCache - If cache image data or not <br> // If set to FALSE, the
     * cached image data will released. <br> // Out: None <br> // <br> //
     * Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCacheImage(EdsImageRef, EdsBool)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1146</i>
     */
    NativeLong EdsCacheImage(EdSdkLibrary.__EdsObject inImageRef, int inUseCache);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsReflectImageProperty <br> // Description:
     * <br> // Incorporates image object property changes <br> // (effected by
     * means of EdsSetPropertyData) in the stream. <br> // <br> // Parameters:
     * <br> // In: inImageRef - The reference of the image. <br> // Out: None
     * <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsReflectImageProperty(EdsImageRef)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1163</i>
     */
    NativeLong EdsReflectImageProperty(EdSdkLibrary.__EdsObject inImageRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateEvfImageRef <br> // Description: <br>
     * // Creates an object used to get the live view image data set. <br> //
     * <br> // Parameters: <br> // In: inStreamRef - The stream reference which
     * opened to get EVF JPEG image. <br> // Out: outEvfImageRef - The EVFData
     * reference. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>EdsError EdsCreateEvfImageRef(EdsStreamRef, EdsEvfImageRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1179</i><br>
     *
     * @deprecated use the safer method
     * {@link #EdsCreateEvfImageRef(edsdk.EdSdkLibrary.__EdsObject, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsCreateEvfImageRef(EdSdkLibrary.__EdsObject inStreamRef, PointerByReference outEvfImageRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsCreateEvfImageRef <br> // Description: <br>
     * // Creates an object used to get the live view image data set. <br> //
     * <br> // Parameters: <br> // In: inStreamRef - The stream reference which
     * opened to get EVF JPEG image. <br> // Out: outEvfImageRef - The EVFData
     * reference. <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>EdsError EdsCreateEvfImageRef(EdsStreamRef, EdsEvfImageRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1179</i>
     */
    NativeLong EdsCreateEvfImageRef(EdSdkLibrary.__EdsObject inStreamRef, EdSdkLibrary.__EdsObject outEvfImageRef[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsDownloadEvfImage <br> // Description: <br>
     * //	Downloads the live view image data set for a camera currently in live
     * view mode. <br> //	Live view can be started by using the property
     * ID:kEdsPropertyID_Evf_OutputDevice and <br> //	data:EdsOutputDevice_PC to
     * call EdsSetPropertyData. <br> //	In addition to image data, information
     * such as zoom, focus position, and histogram data <br> //	is included in
     * the image data set. Image data is saved in a stream maintained by
     * EdsEvfImageRef. <br> //	EdsGetPropertyData can be used to get information
     * such as the zoom, focus position, etc. <br> //	Although the information
     * of the zoom and focus position can be obtained from EdsEvfImageRef, <br>
     * //	settings are applied to EdsCameraRef. <br> // <br> // Parameters: <br>
     * // In: inCameraRef - The Camera reference. <br> // In: inEvfImageRef -
     * The EVFData reference. <br> // <br> // Returns: Any of the sdk errors.
     * <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>EdsError EdsDownloadEvfImage(EdsCameraRef, EdsEvfImageRef)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1204</i>
     */
    NativeLong EdsDownloadEvfImage(EdSdkLibrary.__EdsObject inCameraRef, EdSdkLibrary.__EdsObject inEvfImageRef);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSetCameraAddedHandler <br> // <br> //
     * Description: <br> // Registers a callback function for when a camera is
     * detected. <br> // <br> // Parameters: <br> // In: inCameraAddedHandler -
     * Pointer to a callback function <br> // called when a camera is connected
     * physically <br> // inContext - Specifies an application-defined value to
     * be sent to <br> // the callback function pointed to by CallBack
     * parameter. <br> // Out: None <br> // <br> // Returns: Any of the sdk
     * errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSetCameraAddedHandler(EdsCameraAddedHandler, EdsVoid*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1234</i>
     */
    NativeLong EdsSetCameraAddedHandler(EdSdkLibrary.EdsCameraAddedHandler inCameraAddedHandler, EdSdkLibrary.EdsVoid inContext);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSetPropertyEventHandler <br> // <br> //
     * Description: <br> // Registers a callback function for receiving status
     * <br> // change notification events for property states on a camera. <br>
     * // <br> // Parameters: <br> // In: inCameraRef - Designate the camera
     * object. <br> // inEvent - Designate one or all events to be supplemented.
     * <br> // inPropertyEventHandler - Designate the pointer to the callback
     * <br> // function for receiving property-related camera events. <br> //
     * inContext - Designate application information to be passed by <br> //
     * means of the callback function. Any data needed for <br> // your
     * application can be passed. <br> // Out: None <br> // <br> // Returns: Any
     * of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSetPropertyEventHandler(EdsCameraRef, EdsPropertyEvent, EdsPropertyEventHandler, EdsVoid*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1259</i>
     */
    NativeLong EdsSetPropertyEventHandler(EdSdkLibrary.__EdsObject inCameraRef, NativeLong inEvnet, EdSdkLibrary.EdsPropertyEventHandler inPropertyEventHandler, EdSdkLibrary.EdsVoid inContext);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSetObjectEventHandler <br> // <br> //
     * Description: <br> // Registers a callback function for receiving status
     * <br> // change notification events for objects on a remote camera. <br>
     * // Here, object means volumes representing memory cards, files and
     * directories, <br> // and shot images stored in memory, in particular.
     * <br> // <br> // Parameters: <br> // In: inCameraRef - Designate the
     * camera object. <br> // inEvent - Designate one or all events to be
     * supplemented. <br> // To designate all events, use kEdsObjectEvent_All.
     * <br> // inObjectEventHandler - Designate the pointer to the callback
     * function <br> // for receiving object-related camera events. <br> //
     * inContext - Passes inContext without modification, <br> // as designated
     * as an EdsSetObjectEventHandler argument. <br> // Out: None <br> // <br>
     * // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSetObjectEventHandler(EdsCameraRef, EdsObjectEvent, EdsObjectEventHandler, EdsVoid*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1288</i>
     */
    NativeLong EdsSetObjectEventHandler(EdSdkLibrary.__EdsObject inCameraRef, NativeLong inEvnet, EdSdkLibrary.EdsObjectEventHandler inObjectEventHandler, EdSdkLibrary.EdsVoid inContext);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsSetCameraStateEventHandler <br> // <br> //
     * Description: <br> // Registers a callback function for receiving status
     * <br> // change notification events for property states on a camera. <br>
     * // <br> // Parameters: <br> // In: inCameraRef - Designate the camera
     * object. <br> // inEvent - Designate one or all events to be supplemented.
     * <br> // To designate all events, use kEdsStateEvent_All. <br> //
     * inStateEventHandler - Designate the pointer to the callback function <br>
     * // for receiving events related to camera object states. <br> //
     * inContext - Designate application information to be passed <br> // by
     * means of the callback function. Any data needed for <br> // your
     * application can be passed. <br> // Out: None <br> // <br> // Returns: Any
     * of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsSetCameraStateEventHandler(EdsCameraRef, EdsStateEvent, EdsStateEventHandler, EdsVoid*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1316</i>
     */
    NativeLong EdsSetCameraStateEventHandler(EdSdkLibrary.__EdsObject inCameraRef, NativeLong inEvnet, EdSdkLibrary.EdsStateEventHandler inStateEventHandler, EdSdkLibrary.EdsVoid inContext);

    /**
     * ----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateStream(EdsIStream*, EdsStreamRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1324</i><br>
     *
     * @deprecated use the safer method
     * {@link #EdsCreateStream(edsdk.EdsIStream, edsdk.EdSdkLibrary.__EdsObject[])}
     * instead
     */
    @Deprecated
    NativeLong EdsCreateStream(EdsIStream inStream, PointerByReference outStreamRef);

    /**
     * ----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsCreateStream(EdsIStream*, EdsStreamRef*)</code><br>
     * <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1324</i>
     */
    NativeLong EdsCreateStream(EdsIStream inStream, EdSdkLibrary.__EdsObject outStreamRef[]);

    /**
     * -----------------------------------------------------------------------------
     * <br> // <br> // Function: EdsGetEvent <br> // <br> // Description: <br>
     * // This function acquires an event. <br> // In console application,
     * please call this function regularly to acquire <br> // the event from a
     * camera. <br> // <br> // Parameters: <br> // In: None <br> // Out: None
     * <br> // <br> // Returns: Any of the sdk errors. <br>
     * -----------------------------------------------------------------------------<br>
     * Original signature :
     * <code>__stdcall EdsError EdsGetEvent()</code><br> <i>native declaration :
     * canonsdk-2.9\Windows\EDSDK\Header\EDSDK.h:1341</i>
     */
    NativeLong EdsGetEvent();
    /// Pointer to unknown (opaque) type

    public static class EdsVoid extends PointerType {

        public EdsVoid(Pointer address) {
            super(address);
        }

        public EdsVoid() {
            super();
        }
    };
    /// Pointer to unknown (opaque) type

    public static class __EdsObject extends PointerType {

        public __EdsObject(Pointer address) {
            super(address);
        }

        public __EdsObject() {
            super();
        }
    };
}

package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum AcgThreshold1 implements IRegisterValue {
    // RegAgcThresh1 - not present on RFM69/SX1231
    SNRMARGIN_000(0x00),
    SNRMARGIN_001(0x20),
    SNRMARGIN_010(0x40),
    SNRMARGIN_011(0x60),
    SNRMARGIN_100(0x80),
    SNRMARGIN_101(0xA0), // Default
    SNRMARGIN_110(0xC0),
    SNRMARGIN_111(0xE0),
    STEP1_0(0x00),
    STEP1_1(0x01),
    STEP1_2(0x02),
    STEP1_3(0x03),
    STEP1_4(0x04),
    STEP1_5(0x05),
    STEP1_6(0x06),
    STEP1_7(0x07),
    STEP1_8(0x08),
    STEP1_9(0x09),
    STEP1_10(0x0A),
    STEP1_11(0x0B),
    STEP1_12(0x0C),
    STEP1_13(0x0D),
    STEP1_14(0x0E),
    STEP1_15(0x0F),
    STEP1_16(0x10), // Default
    STEP1_17(0x11),
    STEP1_18(0x12),
    STEP1_19(0x13),
    STEP1_20(0x14),
    STEP1_21(0x15),
    STEP1_22(0x16),
    STEP1_23(0x17),
    STEP1_24(0x18),
    STEP1_25(0x19),
    STEP1_26(0x1A),
    STEP1_27(0x1B),
    STEP1_28(0x1C),
    STEP1_29(0x1D),
    STEP1_30(0x1E),
    STEP1_31(0x1F);

    private byte val;
    
    AcgThreshold1(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

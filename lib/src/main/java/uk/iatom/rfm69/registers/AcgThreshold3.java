package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum AcgThreshold3 implements IRegisterValue {
    // RegAgcThresh3 - not present on RFM69/SX1231
    STEP4_0(0x00),
    STEP4_1(0x10),
    STEP4_2(0x20),
    STEP4_3(0x30),
    STEP4_4(0x40),
    STEP4_5(0x50),
    STEP4_6(0x60),
    STEP4_7(0x70),
    STEP4_8(0x80),
    STEP4_9(0x90), // Default
    STEP4_10(0xA0),
    STEP4_11(0xB0),
    STEP4_12(0xC0),
    STEP4_13(0xD0),
    STEP4_14(0xE0),
    STEP4_15(0xF0),
    STEP5_0(0x00),
    STEP5_1(0x01),
    STEP5_2(0x02),
    STEP5_3(0x03),
    STEP5_4(0x04),
    STEP5_5(0x05),
    STEP5_6(0x06),
    STEP5_7(0x07),
    RF_AGCTHRES33_STEP5_8(0x08),
    STEP5_9(0x09),
    STEP5_10(0x0A),
    STEP5_11(0x0B), // Default
    STEP5_12(0x0C),
    STEP5_13(0x0D),
    STEP5_14(0x0E),
    STEP5_15(0x0F);

    private byte val;
    
    AcgThreshold3(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum AcgThreshold2 implements IRegisterValue {
    // RegAgcThresh2 - not present on RFM69/SX1231
    STEP2_0(0x00),
    STEP2_1(0x10),
    STEP2_2(0x20),
    STEP2_3(0x30), // XXX wrong -- Default
    STEP2_4(0x40),
    STEP2_5(0x50),
    STEP2_6(0x60),
    STEP2_7(0x70), // default
    STEP2_8(0x80),
    STEP2_9(0x90),
    STEP2_10(0xA0),
    STEP2_11(0xB0),
    STEP2_12(0xC0),
    STEP2_13(0xD0),
    STEP2_14(0xE0),
    STEP2_15(0xF0),
    STEP3_0(0x00),
    STEP3_1(0x01),
    STEP3_2(0x02),
    STEP3_3(0x03),
    STEP3_4(0x04),
    STEP3_5(0x05),
    STEP3_6(0x06),
    STEP3_7(0x07),
    STEP3_8(0x08),
    STEP3_9(0x09),
    STEP3_10(0x0A),
    STEP3_11(0x0B), // Default
    STEP3_12(0x0C),
    STEP3_13(0x0D),
    STEP3_14(0x0E),
    STEP3_15(0x0F);

    private byte val;
    
    AcgThreshold2(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

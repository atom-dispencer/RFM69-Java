package uk.iatom.rfm69.magicbytes;

public enum PaRamps {
    // RegPaRamp
    PA_3400(0x00),
    PA_2000(0x01),
    PA_1000(0x02),
    PA_500(0x03),
    PA_250(0x04),
    PA_125(0x05),
    PA_100(0x06),
    PA_62(0x07),
    PA_50(0x08),
    PA_40(0x09), // Default
    PA_31(0x0A),
    PA_25(0x0B),
    PA_20(0x0C),
    PA_15(0x0D),
    PA_12(0x0E),
    PA_10(0x0F);

    private byte val;
    
    PaRamps(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

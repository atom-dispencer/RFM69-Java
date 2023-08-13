package uk.iatom.rfm69.magicbytes;

public enum Lna {
    // RegLna),
    ZIN_50(0x00), // Reset value),
    ZIN_200(0x80), // Recommended default),

    LOWPOWER_OFF(0x00), // Default),
    LOWPOWER_ON(0x40),
    CURRENTGAIN(0x08),
    GAINSELECT_AUTO(0x00), // Default),
    GAINSELECT_MAX(0x01),
    GAINSELECT_MAXMINUS6(0x02),
    GAINSELECT_MAXMINUS12(0x03),
    GAINSELECT_MAXMINUS24(0x04),
    GAINSELECT_MAXMINUS36(0x05),
    GAINSELECT_MAXMINUS48(0x06);

    private byte val;
    
    Lna(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

package uk.iatom.rfm69.magicbytes;

public enum Temp1 {
    

    // RegTemp1),
    MEAS_START(0x08),
    MEAS_RUNNING(0x04),
    // not present on RFM69/SX1231),
    ADCLOWPOWER_ON(0x01), // Default),
    ADCLOWPOWER_OFF(0x00);

    private byte val;
    
    Temp1(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

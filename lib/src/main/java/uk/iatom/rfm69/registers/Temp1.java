package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum Temp1 implements IRegisterValue {
    

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

    @Override public byte val() {
        return val;
    }
}

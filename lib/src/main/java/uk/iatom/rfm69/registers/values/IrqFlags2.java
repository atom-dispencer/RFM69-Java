package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum IrqFlags2 implements IRegisterValue {
    
    // RegIrqFlags2),
    FIFOFULL(0x80),
    FIFONOTEMPTY(0x40),
    FIFOLEVEL(0x20),
    FIFOOVERRUN(0x10),
    PACKETSENT(0x08),
    PAYLOADREADY(0x04),
    CRCOK(0x02),
    LOWBAT(0x01); // not present on RFM69/SX1231

    private byte val;
    
    IrqFlags2(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum IrqFlags1 implements IRegisterValue {
    

    // Reg),
    _MODEREADY(0x80),
    _RXREADY(0x40),
    _TXREADY(0x20),
    _PLLLOCK(0x10),
    _RSSI(0x08),
    _TIMEOUT(0x04),
    _AUTOMODE(0x02),
    _SYNCADDRESSMATCH(0x01);

    private byte val;
    
    IrqFlags1(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

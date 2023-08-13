package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum RxTimeout1 implements IRegisterValue {
    

    // RegRxTimeout1),
    RXSTART_VALUE(0x00); // Default),;

    private byte val;
    
    RxTimeout1(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

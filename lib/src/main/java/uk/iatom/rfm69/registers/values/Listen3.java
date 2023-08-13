package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum Listen3 implements IRegisterValue {
    

    // RegListen3),
    COEFRX_VALUE(0x20); // Default),;

    private byte val;
    
    Listen3(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

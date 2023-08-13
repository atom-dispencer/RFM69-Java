package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum Listen2 implements IRegisterValue {
    
    // RegListen2),
    COEFIDLE_VALUE(0xF5); // Default

    private byte val;
    
    Listen2(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

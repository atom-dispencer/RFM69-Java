package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum Osc1 implements IRegisterValue {
    
    // RegOsc1),
    RCCAL_START(0x80),
    RCCAL_DONE(0x40);

    private byte val;
    
    Osc1(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

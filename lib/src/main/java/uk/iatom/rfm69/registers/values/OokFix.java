package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum OokFix implements IRegisterValue {
    
   
    // RegOokFix),
    FIXEDTHRESH_VALUE(0x06); // Default),;

    private byte val;
    
    OokFix(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
    
}

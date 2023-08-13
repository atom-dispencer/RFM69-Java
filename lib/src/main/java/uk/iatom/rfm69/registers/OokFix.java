package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

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

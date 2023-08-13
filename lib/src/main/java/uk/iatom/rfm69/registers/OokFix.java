package uk.iatom.rfm69.registers;

public enum OokFix {
    
   
    // RegOokFix),
    FIXEDTHRESH_VALUE(0x06); // Default),;

    private byte val;
    
    OokFix(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
    
}

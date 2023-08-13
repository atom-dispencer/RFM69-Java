package uk.iatom.rfm69.magicbytes;

public enum Listen2 {
    
    // RegListen2),
    COEFIDLE_VALUE(0xF5); // Default

    private byte val;
    
    Listen2(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

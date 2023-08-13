package uk.iatom.rfm69.magicbytes;

public enum Listen3 {
    

    // RegListen3),
    COEFRX_VALUE(0x20); // Default),;

    private byte val;
    
    Listen3(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

package uk.iatom.rfm69.magicbytes;

public enum Osc1 {
    
    // RegOsc1),
    RCCAL_START(0x80),
    RCCAL_DONE(0x40);

    private byte val;
    
    Osc1(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

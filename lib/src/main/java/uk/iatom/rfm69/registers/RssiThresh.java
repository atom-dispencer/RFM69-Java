package uk.iatom.rfm69.magicbytes;

public enum RssiThresh {
    

    // RegRssiThresh),
    VALUE(0xE4); // Default),;

    private byte val;
    
    RssiThresh(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

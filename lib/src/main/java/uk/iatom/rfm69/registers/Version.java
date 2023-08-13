package uk.iatom.rfm69.magicbytes;

public enum Version {
    
    // RegVersion),
    _VER(0x24); // Default),;

    private byte val;
    
    Version(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

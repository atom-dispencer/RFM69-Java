package uk.iatom.rfm69.magicbytes;

public enum AfcControl {
    
    // RegAfcCtrl),
    AFCCTRL_LOWBETA_OFF(0x00), // Default),
    AFCCTRL_LOWBETA_ON(0x20);

    private byte val;
    
    AfcControl(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

package uk.iatom.rfm69.registers;

public enum RxTimeout2 {
    
    // RegRxTimeout2),
    RSSITHRESH_VALUE(0x00); // Default),;

    private byte val;
    
    RxTimeout2(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

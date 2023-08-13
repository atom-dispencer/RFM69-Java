package uk.iatom.rfm69.registers;

public enum RxTimeout1 {
    

    // RegRxTimeout1),
    RXSTART_VALUE(0x00); // Default),;

    private byte val;
    
    RxTimeout1(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

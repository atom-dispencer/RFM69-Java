package uk.iatom.rfm69.magicbytes;

public enum PayloadLength {
    
    // RegPayloadLength),
    PAYLOADLENGTH_VALUE(0x40); // Default),;

    private byte val;
    
    PayloadLength(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

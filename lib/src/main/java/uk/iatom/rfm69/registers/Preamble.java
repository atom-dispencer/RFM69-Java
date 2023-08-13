package uk.iatom.rfm69.registers;

public enum Preamble {
    

    // RegPreamble),
    SIZE_MSB_VALUE(0x00), // Default),
    SIZE_LSB_VALUE(0x03); // Default),;

    private byte val;
    
    Preamble(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

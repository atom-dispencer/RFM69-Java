package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum Preamble implements IRegisterValue {
    

    // RegPreamble),
    SIZE_MSB_VALUE(0x00), // Default),
    SIZE_LSB_VALUE(0x03); // Default),;

    private byte val;
    
    Preamble(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum PayloadLength implements IRegisterValue {
    
    // RegPayloadLength),
    PAYLOADLENGTH_VALUE(0x40); // Default),;

    private byte val;
    
    PayloadLength(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

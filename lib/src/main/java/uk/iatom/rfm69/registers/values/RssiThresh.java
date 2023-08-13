package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum RssiThresh implements IRegisterValue {
    

    // RegRssiThresh),
    VALUE(0xE4); // Default),;

    private byte val;
    
    RssiThresh(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

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

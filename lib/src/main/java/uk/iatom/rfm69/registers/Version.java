package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum Version implements IRegisterValue {
    
    // RegVersion),
    _VER(0x24); // Default),;

    private byte val;
    
    Version(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

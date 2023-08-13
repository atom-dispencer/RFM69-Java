package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum RxTimeout2 implements IRegisterValue {
    
    // RegRxTimeout2),
    RSSITHRESH_VALUE(0x00); // Default),;

    private byte val;
    
    RxTimeout2(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

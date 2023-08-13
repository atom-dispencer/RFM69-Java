package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum AfcControl implements IRegisterValue {
    
    // RegAfcCtrl),
    AFCCTRL_LOWBETA_OFF(0x00), // Default),
    AFCCTRL_LOWBETA_ON(0x20);

    private byte val;
    
    AfcControl(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

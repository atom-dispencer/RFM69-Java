package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum BroadcastAddress implements IRegisterValue {

    // RegBroadcastAdrs),
    VALUE(0x00);

    private byte val;

    BroadcastAddress(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

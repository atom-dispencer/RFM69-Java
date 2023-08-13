package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

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

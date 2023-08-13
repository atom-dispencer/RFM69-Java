package uk.iatom.rfm69.registers;

public enum BroadcastAddress {

    // RegBroadcastAdrs),
    VALUE(0x00);

    private byte val;

    BroadcastAddress(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

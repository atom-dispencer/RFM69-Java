package uk.iatom.rfm69.magicbytes;

public enum PacketConfig1 {
    // RegPacketConfig1),
    PACKET1_FORMAT_FIXED(0x00), // Default),
    PACKET1_FORMAT_VARIABLE(0x80),
    PACKET1_DCFREE_OFF(0x00), // Default),
    PACKET1_DCFREE_MANCHESTER(0x20),
    PACKET1_DCFREE_WHITENING(0x40),
    PACKET1_CRC_ON(0x10), // Default),
    PACKET1_CRC_OFF(0x00),
    PACKET1_CRCAUTOCLEAR_ON(0x00), // Default),
    PACKET1_CRCAUTOCLEAR_OFF(0x08),
    PACKET1_ADRSFILTERING_OFF(0x00), // Default),
    PACKET1_ADRSFILTERING_NODE(0x02),
    PACKET1_ADRSFILTERING_NODEBROADCAST(0x04);

    private byte val;
    
    PacketConfig1(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

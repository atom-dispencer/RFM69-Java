package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum Packet2 implements IRegisterValue {
    

    // RegPacketConfig2
    RF_PACKET2_RXRESTARTDELAY_1BIT(0x00), // Default
    RF_PACKET2_RXRESTARTDELAY_2BITS(0x10),
    RF_PACKET2_RXRESTARTDELAY_4BITS(0x20),
    RF_PACKET2_RXRESTARTDELAY_8BITS(0x30),
    RF_PACKET2_RXRESTARTDELAY_16BITS(0x40),
    RF_PACKET2_RXRESTARTDELAY_32BITS(0x50),
    RF_PACKET2_RXRESTARTDELAY_64BITS(0x60),
    RF_PACKET2_RXRESTARTDELAY_128BITS(0x70),
    RF_PACKET2_RXRESTARTDELAY_256BITS(0x80),
    RF_PACKET2_RXRESTARTDELAY_512BITS(0x90),
    RF_PACKET2_RXRESTARTDELAY_1024BITS(0xA0),
    RF_PACKET2_RXRESTARTDELAY_2048BITS(0xB0),
    RF_PACKET2_RXRESTARTDELAY_NONE(0xC0),
    RF_PACKET2_RXRESTART(0x04),
    RF_PACKET2_AUTORXRESTART_ON(0x02), // Default
    RF_PACKET2_AUTORXRESTART_OFF(0x00),
    RF_PACKET2_AES_ON(0x01),
    RF_PACKET2_AES_OFF(0x00); // Default;

    private byte val;
    
    Packet2(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
    
}

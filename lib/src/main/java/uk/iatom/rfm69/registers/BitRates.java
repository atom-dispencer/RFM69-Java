package uk.iatom.rfm69.registers;

public enum BitRates {
    
    // RegBitRate (bits/sec) example bit rates
    MSB_1200(0x68),
    LSB_1200(0x2B),
    MSB_2400(0x34),
    LSB_2400(0x15),
    MSB_4800(0x1A), // Default
    LSB_4800(0x0B), // Default
    MSB_9600(0x0D),
    LSB_9600(0x05),
    MSB_19200(0x06),
    LSB_19200(0x83),
    MSB_38400(0x03),
    LSB_38400(0x41),
    MSB_38323(0x03),
    LSB_38323(0x43),
    MSB_34482(0x03),
    LSB_34482(0xA0),
    MSB_76800(0x01),
    LSB_76800(0xA1),
    MSB_153600(0x00),
    LSB_153600(0xD0),
    MSB_57600(0x02),
    LSB_57600(0x2C),
    MSB_115200(0x01),
    LSB_115200(0x16),
    MSB_12500(0x0A),
    LSB_12500(0x00),
    MSB_25000(0x05),
    LSB_25000(0x00),
    MSB_50000(0x02),
    LSB_50000(0x80),
    MSB_100000(0x01),
    LSB_100000(0x40),
    MSB_150000(0x00),
    LSB_150000(0xD5),
    MSB_200000(0x00),
    LSB_200000(0xA0),
    MSB_250000(0x00),
    LSB_250000(0x80),
    MSB_300000(0x00),
    LSB_300000(0x6B),
    MSB_32768(0x03),
    LSB_32768(0xD1),
    // custom bit rates
    MSB_55555(0x02),
    LSB_55555(0x40),
    MSB_200KBPS(0x00),
    LSB_200KBPS(0xa0);

    private byte val;
    
    BitRates(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

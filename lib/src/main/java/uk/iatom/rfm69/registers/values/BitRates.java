package uk.iatom.rfm69.registers.values;

import uk.iatom.rfm69.registers.IRegisterValue;

public class BitRates {

    public static enum Msb implements IRegisterValue {
        MSB_100000(0x01),
        MSB_115200(0x01),
        MSB_1200(0x68),
        MSB_12500(0x0A),
        MSB_150000(0x00),
        MSB_153600(0x00),
        MSB_19200(0x06),
        MSB_200000(0x00),
        MSB_200KBPS(0x00), // Custom
        MSB_2400(0x34),
        MSB_25000(0x05),
        MSB_250000(0x00),
        MSB_300000(0x00),
        MSB_32768(0x03),
        MSB_34482(0x03),
        MSB_38323(0x03),
        MSB_38400(0x03),
        MSB_4800(0x1A), // Default
        MSB_50000(0x02),
        MSB_55555(0x02), // Custom
        MSB_57600(0x02),
        MSB_76800(0x01),
        MSB_9600(0x0D);

        private byte val;

        Msb(int val) {
            this.val = (byte) val;
        }

        @Override
        public byte val() {
            return val;
        }
    }

    public static enum Lsb implements IRegisterValue {

        // custom bit rates
        LSB_100000(0x40),
        LSB_115200(0x16),
        LSB_1200(0x2B),
        LSB_12500(0x00),
        LSB_150000(0xD5),
        LSB_153600(0xD0),
        LSB_19200(0x83),
        LSB_200000(0xA0),
        LSB_200KBPS(0xa0), // Custom
        LSB_2400(0x15),
        LSB_25000(0x00),
        LSB_250000(0x80),
        LSB_300000(0x6B),
        LSB_32768(0xD1),
        LSB_34482(0xA0),
        LSB_38323(0x43),
        LSB_38400(0x41),
        LSB_4800(0x0B), // Default
        LSB_50000(0x80),
        LSB_55555(0x40), // Custom
        LSB_57600(0x2C),
        LSB_76800(0xA1),
        LSB_9600(0x05);

        private byte val;

        Lsb(int val) {
            this.val = (byte) val;
        }

        @Override
        public byte val() {
            return val;
        }
    }
}

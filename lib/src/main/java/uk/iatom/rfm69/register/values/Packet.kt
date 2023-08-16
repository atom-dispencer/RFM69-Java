package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

class Packet {

    enum class Config1(`val`: Int): IRegisterValue { // RegPacketConfig1),
        FORMAT_FIXED(0x00),


        // Default),
        FORMAT_VARIABLE(0x80),
        DCFREE_OFF(0x00),


        // Default),
        DCFREE_MANCHESTER(0x20),
        DCFREE_WHITENING(0x40),
        CRC_ON(0x10),


        // Default),
        CRC_OFF(0x00),
        CRCAUTOCLEAR_ON(0x00),


        // Default),
        CRCAUTOCLEAR_OFF(0x08),
        ADRSFILTERING_OFF(0x00),


        // Default),
        ADRSFILTERING_NODE(0x02),
        ADRSFILTERING_NODEBROADCAST(0x04);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }

    enum class Config2(`val`: Int): IRegisterValue { // RegPacketConfig2
        RXRESTARTDELAY_1BIT(0x00),


        // Default
        RXRESTARTDELAY_2BITS(0x10),
        RXRESTARTDELAY_4BITS(0x20),
        RXRESTARTDELAY_8BITS(0x30),
        RXRESTARTDELAY_16BITS(0x40),
        RXRESTARTDELAY_32BITS(0x50),
        RXRESTARTDELAY_64BITS(0x60),
        RXRESTARTDELAY_128BITS(0x70),
        RXRESTARTDELAY_256BITS(0x80),
        RXRESTARTDELAY_512BITS(0x90),
        RXRESTARTDELAY_1024BITS(0xA0),
        RXRESTARTDELAY_2048BITS(0xB0),
        RXRESTARTDELAY_NONE(0xC0),
        RXRESTART(0x04),
        AUTORXRESTART_ON(0x02),


        // Default
        AUTORXRESTART_OFF(0x00),
        AES_ON(0x01),
        AES_OFF(0x00);


        // Default;
        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }
}
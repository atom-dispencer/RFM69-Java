package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

class Rx { enum class Bw(`val`: Int): IRegisterValue { // RegRxBw),
    DCCFREQ_000(0x00),
    DCCFREQ_001(0x20),
    DCCFREQ_010(0x40),


    // Recommended default),
    DCCFREQ_011(0x60),
    DCCFREQ_100(0x80),


    // Reset value),
    DCCFREQ_101(0xA0),
    DCCFREQ_110(0xC0),
    DCCFREQ_111(0xE0),
    MANT_16(0x00),


    // Reset value),
    MANT_20(0x08),
    MANT_24(0x10),


    // Recommended default),
    EXP_0(0x00),
    EXP_1(0x01),
    EXP_2(0x02),
    EXP_3(0x03),
    EXP_4(0x04),
    EXP_5(0x05),


    // Recommended default),
    EXP_6(0x06),


    // Reset value),
    EXP_7(0x07);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun getByte(): Byte {
        return `val`
    }
}

    enum class Timeout1(`val`: Int): IRegisterValue { // RegRxTimeout1),
        RXSTART_VALUE(0x00);


        // Default),;
        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }

    enum class Timeout2(`val`: Int): IRegisterValue { // RegRxTimeout2),
        RSSITHRESH_VALUE(0x00);


        // Default),;
        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }
}
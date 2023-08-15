package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

class Dio { enum class Mapping1(`val`: Int): IRegisterValue { // RegDioMapping1),
    DIO0_00(0x00),


    // Default),
    DIO0_01(0x40),
    DIO0_10(0x80),
    DIO0_11(0xC0),
    DIO1_00(0x00),


    // Default),
    DIO1_01(0x10),
    DIO1_10(0x20),
    DIO1_11(0x30),
    DIO2_00(0x00),


    // Default),
    DIO2_01(0x04),
    DIO2_10(0x08),
    DIO2_11(0x0C),
    DIO3_00(0x00),


    // Default),
    DIO3_01(0x01),
    DIO3_10(0x02),
    DIO3_11(0x03);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

    enum class Mapping2(`val`: Int): IRegisterValue { // RegDioMapping2),
        DIO4_00(0x00),


        // Default),
        DIO4_01(0x40),
        DIO4_10(0x80),
        DIO4_11(0xC0),
        DIO5_00(0x00),


        // Default),
        DIO5_01(0x10),
        DIO5_10(0x20),
        DIO5_11(0x30),
        CLKOUT_32MHZ(0x00),
        CLKOUT_16MHZ(0x01),
        CLKOUT_8MHZ(0x02),
        CLKOUT_4MHZ(0x03),
        CLKOUT_2MHZ(0x04),
        CLKOUT_1MHZ(0x05),


        // Reset value),
        CLKOUT_RC(0x06),
        CLKOUT_OFF(0x07);


        // Recommended default
        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun `val`(): Byte {
            return `val`
        }
    }
}
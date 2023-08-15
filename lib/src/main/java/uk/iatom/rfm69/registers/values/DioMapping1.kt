package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class DioMapping1(`val`: Int): IRegisterValue { // RegDioMapping1),
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

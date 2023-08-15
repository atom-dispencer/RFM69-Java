package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class Preamble(`val`: Int): IRegisterValue { // RegPreamble),
SIZE_MSB_VALUE(0x00),


    // Default),
    SIZE_LSB_VALUE(0x03);


    // Default),;
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class RssiConfig(`val`: Int): IRegisterValue { // RegRssiConfig),
FASTRX_ON(0x08),


    // not present on RFM69/SX1231),
    FASTRX_OFF(0x00),


    // Default),
    DONE(0x02),
    START(0x01);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

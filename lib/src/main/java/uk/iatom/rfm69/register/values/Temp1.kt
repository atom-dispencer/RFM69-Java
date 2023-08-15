package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

enum class Temp1(`val`: Int): IRegisterValue { // RegTemp1),
    MEAS_START(0x08),
    MEAS_RUNNING(0x04),


    // not present on RFM69/SX1231),
    ADCLOWPOWER_ON(0x01),


    // Default),
    ADCLOWPOWER_OFF(0x00);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

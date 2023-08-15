package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class AfcControl(`val`: Int): IRegisterValue { // RegAfcCtrl),
AFCCTRL_LOWBETA_OFF(0x00),


    // Default),
    AFCCTRL_LOWBETA_ON(0x20);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

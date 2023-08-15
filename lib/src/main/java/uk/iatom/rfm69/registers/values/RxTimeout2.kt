package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class RxTimeout2(`val`: Int): IRegisterValue { // RegRxTimeout2),
RSSITHRESH_VALUE(0x00);


    // Default),;
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

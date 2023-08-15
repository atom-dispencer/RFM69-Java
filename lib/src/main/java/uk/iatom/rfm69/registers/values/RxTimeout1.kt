package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class RxTimeout1(`val`: Int): IRegisterValue { // RegRxTimeout1),
RXSTART_VALUE(0x00);


    // Default),;
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

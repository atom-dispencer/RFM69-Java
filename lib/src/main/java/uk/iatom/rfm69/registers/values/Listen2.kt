package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class Listen2(`val`: Int): IRegisterValue { // RegListen2),
COEFIDLE_VALUE(0xF5);


    // Default
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

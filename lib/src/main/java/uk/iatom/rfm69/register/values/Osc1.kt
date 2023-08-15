package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

enum class Osc1(`val`: Int): IRegisterValue { // RegOsc1),
    RCCAL_START(0x80),
    RCCAL_DONE(0x40);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

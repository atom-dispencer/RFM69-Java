package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class BroadcastAddress(`val`: Int): IRegisterValue { // RegBroadcastAdrs),
VALUE(0x00);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

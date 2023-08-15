package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class PayloadLength(`val`: Int): IRegisterValue { // RegPayloadLength),
    PAYLOADLENGTH_VALUE(0x40);


    // Default),;
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

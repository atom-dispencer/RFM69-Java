package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

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

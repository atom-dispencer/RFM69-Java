package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

/**
 * Binding for RegFifoThresh
 */
enum class FifoThresh(`val`: Int): IRegisterValue {


    TXSTART_FIFOTHRESH(0x00),


    // Reset value
    TXSTART_FIFONOTEMPTY(0x80),


    // Recommended default
    DEFAULT(0x0F);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun getByte(): Byte {
        return `val`
    }
}

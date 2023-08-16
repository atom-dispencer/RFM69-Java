package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

enum class Version(`val`: Int): IRegisterValue { // RegVersion),
    _VER(0x24);


    // Default),;
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun getByte(): Byte {
        return `val`
    }
}

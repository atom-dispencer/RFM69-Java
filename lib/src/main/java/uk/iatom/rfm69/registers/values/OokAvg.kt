package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class OokAvg(`val`: Int): IRegisterValue { // RegOokAvg),
AVERAGETHRESHFILT_00(0x00),
    AVERAGETHRESHFILT_01(0x40),
    AVERAGETHRESHFILT_10(0x80),


    // Default),
    AVERAGETHRESHFILT_11(0xC0);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

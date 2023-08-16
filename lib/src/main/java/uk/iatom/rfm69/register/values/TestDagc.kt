package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

enum class TestDagc(`val`: Int): IRegisterValue { // RegTestDagc),
    NORMAL(0x00),


    // Reset value),
    IMPROVED_LOWBETA1(0x20),
    IMPROVED_LOWBETA0(0x30);


    // Recommended default),;
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun getByte(): Byte {
        return `val`
    }
}

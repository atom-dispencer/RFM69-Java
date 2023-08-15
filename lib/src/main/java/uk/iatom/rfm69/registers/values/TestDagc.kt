package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

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

    override fun `val`(): Byte {
        return `val`
    }
}

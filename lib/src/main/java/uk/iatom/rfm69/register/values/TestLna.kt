package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

enum class TestLna(`val`: Int): IRegisterValue { // RegTestLna),
    NORMAL(0x1B),
    HIGH_SENSITIVITY(0x2D);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

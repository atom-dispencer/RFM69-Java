package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class Ocp(`val`: Int): IRegisterValue { // RegOcp
OFF(0x0F),
    ON(0x1A),


    // Default
    TRIM_45(0x00),
    TRIM_50(0x01),
    TRIM_55(0x02),
    TRIM_60(0x03),
    TRIM_65(0x04),
    TRIM_70(0x05),
    TRIM_75(0x06),
    TRIM_80(0x07),
    TRIM_85(0x08),
    TRIM_90(0x09),
    TRIM_95(0x0A),


    // Default
    TRIM_100(0x0B),
    TRIM_105(0x0C),
    TRIM_110(0x0D),
    TRIM_115(0x0E),
    TRIM_120(0x0F);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

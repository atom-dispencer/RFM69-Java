package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class PaLevels(`val`: Int): IRegisterValue { // RegPaLevel
PA0_ON(0x80),


    // Default
    PA0_OFF(0x00),
    PA1_ON(0x40),
    PA1_OFF(0x00),


    // Default
    PA2_ON(0x20),
    PA2_OFF(0x00),


    // Default
    OUTPUTPOWER_00000(0x00),
    OUTPUTPOWER_00001(0x01),
    OUTPUTPOWER_00010(0x02),
    OUTPUTPOWER_00011(0x03),
    OUTPUTPOWER_00100(0x04),
    OUTPUTPOWER_00101(0x05),
    OUTPUTPOWER_00110(0x06),
    OUTPUTPOWER_00111(0x07),
    OUTPUTPOWER_01000(0x08),
    OUTPUTPOWER_01001(0x09),
    OUTPUTPOWER_01011(0x0B),
    OUTPUTPOWER_01100(0x0C),
    OUTPUTPOWER_01101(0x0D),
    OUTPUTPOWER_01110(0x0E),
    OUTPUTPOWER_01111(0x0F),
    OUTPUTPOWER_10000(0x10),
    OUTPUTPOWER_10001(0x11),
    OUTPUTPOWER_10010(0x12),
    OUTPUTPOWER_10011(0x13),
    OUTPUTPOWER_10100(0x14),
    OUTPUTPOWER_10101(0x15),
    OUTPUTPOWER_10110(0x16),
    OUTPUTPOWER_10111(0x17),
    OUTPUTPOWER_11000(0x18),
    OUTPUTPOWER_11001(0x19),
    OUTPUTPOWER_11010(0x1A),
    OUTPUTPOWER_11011(0x1B),
    OUTPUTPOWER_11100(0x1C),
    OUTPUTPOWER_11101(0x1D),
    OUTPUTPOWER_11110(0x1E),
    OUTPUTPOWER_11111(0x1F);


    // Default;
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}
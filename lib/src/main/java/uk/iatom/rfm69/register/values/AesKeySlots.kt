package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

enum class AesKeySlots(`val`: Int): IRegisterValue { // RegAesKey1-16
    RF_AESKEY1_VALUE(0x00),


    // Default
    RF_AESKEY2_VALUE(0x00),


    // Default
    RF_AESKEY3_VALUE(0x00),


    // Default
    RF_AESKEY4_VALUE(0x00),


    // Default
    RF_AESKEY5_VALUE(0x00),


    // Default
    RF_AESKEY6_VALUE(0x00),


    // Default
    RF_AESKEY7_VALUE(0x00),


    // Default
    RF_AESKEY8_VALUE(0x00),


    // Default
    RF_AESKEY9_VALUE(0x00),


    // Default
    RF_AESKEY10_VALUE(0x00),


    // Default
    RF_AESKEY11_VALUE(0x00),


    // Default
    RF_AESKEY12_VALUE(0x00),


    // Default
    RF_AESKEY13_VALUE(0x00),


    // Default
    RF_AESKEY14_VALUE(0x00),


    // Default
    RF_AESKEY15_VALUE(0x00),


    // Default
    RF_AESKEY16_VALUE(0x00);


    // Default
    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun getByte(): Byte {
        return `val`
    }
}

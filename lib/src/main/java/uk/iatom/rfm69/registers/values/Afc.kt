package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

class Afc { enum class Bws(`val`: Int): IRegisterValue { // RegAfcBw
    PADCCFREQAFC_000(0x00),
    PADCCFREQAFC_001(0x20),
    PADCCFREQAFC_010(0x40),
    PADCCFREQAFC_011(0x60),
    PADCCFREQAFC_100(0x80),


    // Default
    PADCCFREQAFC_101(0xA0),
    PADCCFREQAFC_110(0xC0),
    PADCCFREQAFC_111(0xE0),
    PAMANTAFC_16(0x00),
    PAMANTAFC_20(0x08),


    // Default
    PAMANTAFC_24(0x10),
    PAEXPAFC_0(0x00),
    PAEXPAFC_1(0x01),
    PAEXPAFC_2(0x02),


    // Reset value
    PAEXPAFC_3(0x03),


    // Recommended default
    PAEXPAFC_4(0x04),
    PAEXPAFC_5(0x05),
    PAEXPAFC_6(0x06),
    PAEXPAFC_7(0x07);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

    enum class Control(`val`: Int): IRegisterValue { // RegAfcCtrl),
        AFCCTRL_LOWBETA_OFF(0x00),


        // Default),
        AFCCTRL_LOWBETA_ON(0x20);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun `val`(): Byte {
            return `val`
        }
    }

    enum class Fei(`val`: Int): IRegisterValue { // RegAfcFei),
        AFCFEI_FEI_DONE(0x40),
        AFCFEI_FEI_START(0x20),
        AFCFEI_AFC_DONE(0x10),
        AFCFEI_AFCAUTOCLEAR_ON(0x08),
        AFCFEI_AFCAUTOCLEAR_OFF(0x00),


        // Default),
        AFCFEI_AFCAUTO_ON(0x04),
        AFCFEI_AFCAUTO_OFF(0x00),


        // Default),
        AFCFEI_AFC_CLEAR(0x02),
        AFCFEI_AFC_START(0x01);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun `val`(): Byte {
            return `val`
        }
    }
}
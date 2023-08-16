package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

class Agc {

    enum class Refs(`val`: Int): IRegisterValue { // RegAgcRef - not present on
        // RFM69/SX1231
        AUTO_ON(0x40),


        // Default
        AUTO_OFF(0x00),
        LEVEL_MINUS80(0x00),


        // Default
        LEVEL_MINUS81(0x01),
        LEVEL_MINUS82(0x02),
        LEVEL_MINUS83(0x03),
        LEVEL_MINUS84(0x04),
        LEVEL_MINUS85(0x05),
        LEVEL_MINUS86(0x06),
        LEVEL_MINUS87(0x07),
        LEVEL_MINUS88(0x08),
        LEVEL_MINUS89(0x09),
        LEVEL_MINUS90(0x0A),
        LEVEL_MINUS91(0x0B),
        LEVEL_MINUS92(0x0C),
        LEVEL_MINUS93(0x0D),
        LEVEL_MINUS94(0x0E),
        LEVEL_MINUS95(0x0F),
        LEVEL_MINUS96(0x10),
        LEVEL_MINUS97(0x11),
        LEVEL_MINUS98(0x12),
        LEVEL_MINUS99(0x13),
        LEVEL_MINUS100(0x14),
        LEVEL_MINUS101(0x15),
        LEVEL_MINUS102(0x16),
        LEVEL_MINUS103(0x17),
        LEVEL_MINUS104(0x18),
        LEVEL_MINUS105(0x19),
        LEVEL_MINUS106(0x1A),
        LEVEL_MINUS107(0x1B),
        LEVEL_MINUS108(0x1C),
        LEVEL_MINUS109(0x1D),
        LEVEL_MINUS110(0x1E),
        LEVEL_MINUS111(0x1F),
        LEVEL_MINUS112(0x20),
        LEVEL_MINUS113(0x21),
        LEVEL_MINUS114(0x22),
        LEVEL_MINUS115(0x23),
        LEVEL_MINUS116(0x24),
        LEVEL_MINUS117(0x25),
        LEVEL_MINUS118(0x26),
        LEVEL_MINUS119(0x27),
        LEVEL_MINUS120(0x28),
        LEVEL_MINUS121(0x29),
        LEVEL_MINUS122(0x2A),
        LEVEL_MINUS123(0x2B),
        LEVEL_MINUS124(0x2C),
        LEVEL_MINUS125(0x2D),
        LEVEL_MINUS126(0x2E),
        LEVEL_MINUS127(0x2F),
        LEVEL_MINUS128(0x30),
        LEVEL_MINUS129(0x31),
        LEVEL_MINUS130(0x32),
        LEVEL_MINUS131(0x33),
        LEVEL_MINUS132(0x34),
        LEVEL_MINUS133(0x35),
        LEVEL_MINUS134(0x36),
        LEVEL_MINUS135(0x37),
        LEVEL_MINUS136(0x38),
        LEVEL_MINUS137(0x39),
        LEVEL_MINUS138(0x3A),
        LEVEL_MINUS139(0x3B),
        LEVEL_MINUS140(0x3C),
        LEVEL_MINUS141(0x3D),
        LEVEL_MINUS142(0x3E),
        LEVEL_MINUS143(0x3F);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }

    enum class Threshold1(`val`: Int): IRegisterValue {


        // RegAgcThresh1 - not present on RFM69/SX1231
        SNRMARGIN_000(0x00),
        SNRMARGIN_001(0x20),
        SNRMARGIN_010(0x40),
        SNRMARGIN_011(0x60),
        SNRMARGIN_100(0x80),
        SNRMARGIN_101(0xA0),


        // Default
        SNRMARGIN_110(0xC0),
        SNRMARGIN_111(0xE0),
        STEP1_0(0x00),
        STEP1_1(0x01),
        STEP1_2(0x02),
        STEP1_3(0x03),
        STEP1_4(0x04),
        STEP1_5(0x05),
        STEP1_6(0x06),
        STEP1_7(0x07),
        STEP1_8(0x08),
        STEP1_9(0x09),
        STEP1_10(0x0A),
        STEP1_11(0x0B),
        STEP1_12(0x0C),
        STEP1_13(0x0D),
        STEP1_14(0x0E),
        STEP1_15(0x0F),
        STEP1_16(0x10),


        // Default
        STEP1_17(0x11),
        STEP1_18(0x12),
        STEP1_19(0x13),
        STEP1_20(0x14),
        STEP1_21(0x15),
        STEP1_22(0x16),
        STEP1_23(0x17),
        STEP1_24(0x18),
        STEP1_25(0x19),
        STEP1_26(0x1A),
        STEP1_27(0x1B),
        STEP1_28(0x1C),
        STEP1_29(0x1D),
        STEP1_30(0x1E),
        STEP1_31(0x1F);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }


    enum class Threshold2(`val`: Int): IRegisterValue {


        // RegAgcThresh2 - not present on RFM69/SX1231
        STEP2_0(0x00),
        STEP2_1(0x10),
        STEP2_2(0x20),
        STEP2_3(0x30),


        // XXX wrong -- Default
        STEP2_4(0x40),
        STEP2_5(0x50),
        STEP2_6(0x60),
        STEP2_7(0x70),


        // default
        STEP2_8(0x80),
        STEP2_9(0x90),
        STEP2_10(0xA0),
        STEP2_11(0xB0),
        STEP2_12(0xC0),
        STEP2_13(0xD0),
        STEP2_14(0xE0),
        STEP2_15(0xF0),
        STEP3_0(0x00),
        STEP3_1(0x01),
        STEP3_2(0x02),
        STEP3_3(0x03),
        STEP3_4(0x04),
        STEP3_5(0x05),
        STEP3_6(0x06),
        STEP3_7(0x07),
        STEP3_8(0x08),
        STEP3_9(0x09),
        STEP3_10(0x0A),
        STEP3_11(0x0B),


        // Default
        STEP3_12(0x0C),
        STEP3_13(0x0D),
        STEP3_14(0x0E),
        STEP3_15(0x0F);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }

    enum class Threshold3(`val`: Int): IRegisterValue {


        // RegAgcThresh3 - not present on RFM69/SX1231
        STEP4_0(0x00),
        STEP4_1(0x10),
        STEP4_2(0x20),
        STEP4_3(0x30),
        STEP4_4(0x40),
        STEP4_5(0x50),
        STEP4_6(0x60),
        STEP4_7(0x70),
        STEP4_8(0x80),
        STEP4_9(0x90),


        // Default
        STEP4_10(0xA0),
        STEP4_11(0xB0),
        STEP4_12(0xC0),
        STEP4_13(0xD0),
        STEP4_14(0xE0),
        STEP4_15(0xF0),
        STEP5_0(0x00),
        STEP5_1(0x01),
        STEP5_2(0x02),
        STEP5_3(0x03),
        STEP5_4(0x04),
        STEP5_5(0x05),
        STEP5_6(0x06),
        STEP5_7(0x07),
        RF_AGCTHRES33_STEP5_8(0x08),
        STEP5_9(0x09),
        STEP5_10(0x0A),
        STEP5_11(0x0B),


        // Default
        STEP5_12(0x0C),
        STEP5_13(0x0D),
        STEP5_14(0x0E),
        STEP5_15(0x0F);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }
}
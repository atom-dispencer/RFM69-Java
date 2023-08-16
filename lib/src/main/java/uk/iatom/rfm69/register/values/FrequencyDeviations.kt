package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

class FrequencyDeviations {


    enum class Msb(`val`: Int): IRegisterValue { MSB_10000(0x00),
        MSB_100000(0x06),
        MSB_110000(0x07),
        MSB_120000(0x07),
        MSB_130000(0x08),
        MSB_140000(0x08),
        MSB_15000(0x00),
        MSB_150000(0x09),
        MSB_160000(0x0A),
        MSB_170000(0x0A),
        MSB_180000(0x0B),
        MSB_190000(0x0C),
        MSB_20000(0x01),
        MSB_200000(0x0C),
        MSB_210000(0x0D),
        MSB_220000(0x0E),
        MSB_230000(0x0E),
        MSB_240000(0x0F),
        MSB_25000(0x01),
        MSB_250000(0x10),
        MSB_260000(0x10),
        MSB_270000(0x11),
        MSB_280000(0x11),
        MSB_290000(0x12),
        MSB_30000(0x01),
        MSB_300000(0x13),
        MSB_35000(0x02),
        MSB_40000(0x02),
        MSB_45000(0x02),
        MSB_5000(0x00),


        // Default
        MSB_50000(0x03),
        MSB_55000(0x03),
        MSB_60000(0x03),
        MSB_65000(0x04),
        MSB_70000(0x04),
        MSB_7500(0x00),
        MSB_75000(0x04),
        MSB_80000(0x05),
        MSB_85000(0x05),
        MSB_90000(0x05),
        MSB_95000(0x06),
        MSB_2000(0x00);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }

    enum class Lsb(`val`: Int): IRegisterValue { LSB_10000(0xA4),
        LSB_100000(0x66),
        LSB_110000(0x0A),
        LSB_120000(0xAE),
        LSB_130000(0x52),
        LSB_140000(0xF6),
        LSB_15000(0xF6),
        LSB_150000(0x9A),
        LSB_160000(0x3D),
        LSB_170000(0xE1),
        LSB_180000(0x85),
        LSB_190000(0x29),
        LSB_2000(0x21),
        LSB_20000(0x48),
        LSB_200000(0xCD),
        LSB_210000(0x71),
        LSB_220000(0x14),
        LSB_230000(0xB8),
        LSB_240000(0x5C),
        LSB_25000(0x9A),
        LSB_250000(0x00),
        LSB_260000(0xA4),
        LSB_270000(0x48),
        LSB_280000(0xEC),
        LSB_290000(0x8F),
        LSB_30000(0xEC),
        LSB_300000(0x33),
        LSB_35000(0x3D),
        LSB_40000(0x8F),
        LSB_45000(0xE1),
        LSB_5000(0x52),


        // Default
        LSB_50000(0x33),
        LSB_55000(0x85),
        LSB_60000(0xD7),
        LSB_65000(0x29),
        LSB_70000(0x7B),
        LSB_7500(0x7B),
        LSB_75000(0xCD),
        LSB_80000(0x1F),
        LSB_85000(0x71),
        LSB_90000(0xC3),
        LSB_95000(0x14);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }
}

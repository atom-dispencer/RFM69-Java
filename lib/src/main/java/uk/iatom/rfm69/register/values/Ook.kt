package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

class Ook { enum class Avg(`val`: Int): IRegisterValue { // RegOokAvg),
    AVERAGETHRESHFILT_00(0x00),
    AVERAGETHRESHFILT_01(0x40),
    AVERAGETHRESHFILT_10(0x80),


    // Default),
    AVERAGETHRESHFILT_11(0xC0);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun getByte(): Byte {
        return `val`
    }
}

    enum class Fix(`val`: Int): IRegisterValue { // RegOokFix),
        FIXEDTHRESH_VALUE(0x06);


        // Default),;
        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }

    enum class Peaks(`val`: Int): IRegisterValue { // RegOokPeak
        THRESHTYPE_FIXED(0x00),
        THRESHTYPE_PEAK(0x40),


        // Default
        THRESHTYPE_AVERAGE(0x80),
        PEAKTHRESHSTEP_000(0x00),


        // Default
        PEAKTHRESHSTEP_001(0x08),
        PEAKTHRESHSTEP_010(0x10),
        PEAKTHRESHSTEP_011(0x18),
        PEAKTHRESHSTEP_100(0x20),
        PEAKTHRESHSTEP_101(0x28),
        PEAKTHRESHSTEP_110(0x30),
        PEAKTHRESHSTEP_111(0x38),
        PEAKTHRESHDEC_000(0x00),


        // Default
        PEAKTHRESHDEC_001(0x01),
        PEAKTHRESHDEC_010(0x02),
        PEAKTHRESHDEC_011(0x03),
        PEAKTHRESHDEC_100(0x04),
        PEAKTHRESHDEC_101(0x05),
        PEAKTHRESHDEC_110(0x06),
        PEAKTHRESHDEC_111(0x07);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }
}
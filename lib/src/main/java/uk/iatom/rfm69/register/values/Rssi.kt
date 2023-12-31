package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue

class Rssi {

    enum class Config(`val`: Int): IRegisterValue { // RegRssiConfig),
        FASTRX_ON(0x08),


        // not present on RFM69/SX1231),
        FASTRX_OFF(0x00),


        // Default),
        DONE(0x02),
        START(0x01);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }

    enum class Thresh(`val`: Int): IRegisterValue { // RegRssiThresh),
        VALUE(0xE4);


        // Default),;
        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun getByte(): Byte {
            return `val`
        }
    }
}
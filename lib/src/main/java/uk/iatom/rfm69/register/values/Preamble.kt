package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterValue


class Preamble {


    enum class Msb(`val`: Int): IRegisterValue { // RegPreamble),
        SIZE(0x00);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun `val`(): Byte {
            return `val`
        }
    }

    enum class Lsb(`val`: Int): IRegisterValue { // RegPreamble),

        SIZE(0x03);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun `val`(): Byte {
            return `val`
        }
    }
}



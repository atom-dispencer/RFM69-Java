package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

class Irq {


    enum class Flags1(`val`: Int): IRegisterValue { // Reg),
        _MODEREADY(0x80),
        _RXREADY(0x40),
        _TXREADY(0x20),
        _PLLLOCK(0x10),
        _RSSI(0x08),
        _TIMEOUT(0x04),
        _AUTOMODE(0x02),
        _SYNCADDRESSMATCH(0x01);

        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun `val`(): Byte {
            return `val`
        }
    }

    enum class Flags2(`val`: Int): IRegisterValue { // RegIrqFlags2),
        FIFOFULL(0x80),
        FIFONOTEMPTY(0x40),
        FIFOLEVEL(0x20),
        FIFOOVERRUN(0x10),
        PACKETSENT(0x08),
        PAYLOADREADY(0x04),
        CRCOK(0x02),
        LOWBAT(0x01);


        // not present on RFM69/SX1231
        private val `val`: Byte

        init {
            this.`val` = `val`.toByte()
        }

        override fun `val`(): Byte {
            return `val`
        }
    }
}
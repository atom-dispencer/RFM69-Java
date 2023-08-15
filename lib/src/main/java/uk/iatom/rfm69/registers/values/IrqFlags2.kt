package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class IrqFlags2(`val`: Int): IRegisterValue { // RegIrqFlags2),
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

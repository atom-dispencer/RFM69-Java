package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class IrqFlags1(`val`: Int): IRegisterValue { // Reg),
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

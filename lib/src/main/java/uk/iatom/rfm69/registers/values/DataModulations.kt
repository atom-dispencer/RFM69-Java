package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class DataModulations(`val`: Int): IRegisterValue { // RegDataModul),
    RF_DATAMODUL_DATAMODE_PACKET(0x00),


    // Default),
    RF_DATAMODUL_DATAMODE_CONTINUOUS(0x40),
    RF_DATAMODUL_DATAMODE_CONTINUOUSNOBSYNC(0x60),
    RF_DATAMODUL_MODULATIONTYPE_FSK(0x00),


    // Default),
    RF_DATAMODUL_MODULATIONTYPE_OOK(0x08),
    RF_DATAMODUL_MODULATIONSHAPING_00(0x00),


    // Default),
    RF_DATAMODUL_MODULATIONSHAPING_01(0x01),
    RF_DATAMODUL_MODULATIONSHAPING_10(0x02),
    RF_DATAMODUL_MODULATIONSHAPING_11(0x03);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue

enum class OpModes(`val`: Int): IRegisterValue { // RegOpMode
    SEQUENCER_OFF(0x80),
    SEQUENCER_ON(0x00),


    // Default
    LISTEN_ON(0x40),
    LISTEN_OFF(0x00),


    // Default
    LISTENABORT(0x20),
    SLEEP(0x00),
    STANDBY(0x04),


    // Default
    SYNTHESIZER(0x08),
    TRANSMITTER(0x0C),
    RECEIVER(0x10);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }
}

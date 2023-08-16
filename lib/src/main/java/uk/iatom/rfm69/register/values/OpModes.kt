package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.ICodec
import uk.iatom.rfm69.register.IRegisterValue

// RegOpMode
class OpModes(
        var sequencer: Sequencer = Sequencer.ON,
        var listen: Listen = Listen.OFF,
        var power: Power = Power.STANDBY
             ): IRegisterValue {


    enum class Sequencer(val v: Int) {
        ON(0x80),
        OFF(0x00)
    }

    enum class Listen(val v: Int) {
        ON(0x40),
        OFF(0x00),
    }

    enum class ListenAbort(val v: Int) {
        // Default unknown //TODO Find listenabort default
        ON(0x20),
        OFF(0x00),
    }

    enum class Power(val v: Int) {
        RECEIVER(0x10),
        SYNTHESIZER(0x08),
        STANDBY(0x04),
        TRANSMITTER(0x0C),
        SLEEP(0x00),
    }

    override fun getByte(): Byte {
        return (sequencer.v or listen.v or power.v).toByte()
    }

    class Codec: ICodec<OpModes> {


        override fun encode(value: OpModes): Byte = value.getByte()

        override fun decode(byte: Byte): OpModes {
            TODO("Not yet implemented")
        }
    }
}

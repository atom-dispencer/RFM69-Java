package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.ICodec
import uk.iatom.rfm69.register.IRegisterValue

/**
 * RegDataModul
 */
data class DataModulations(
        val dataMode: DataMode = DataMode.PACKET,
        val modulationType: ModulationType = ModulationType.FSK,
        val modulationShaping: ModulationShaping = ModulationShaping.S_00
                          ): IRegisterValue {


    enum class DataMode(val b: Int) { PACKET(0x00),
        CONTINUOUS(0x40),
        CONTINUOUS_NO_BSYNC(0x60),
    }

    enum class ModulationType(val b: Int) { FSK(0x00),
        OOK(0x08),
    }

    enum class ModulationShaping(val b: Int) { S_00(0x00),
        S_01(0x01),
        S_10(0x02),
        S_11(0x03);
    }

    override fun getByte(): Byte {
        return (dataMode.b or modulationType.b or modulationShaping.b).toByte()
    }

    class Codec: ICodec<DataModulations> {


        override fun encode(value: DataModulations): Byte = value.getByte()

        override fun decode(byte: Byte): DataModulations {
            TODO("Not yet implemented")
        }
    }
}

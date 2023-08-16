package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.IRegisterGroup
import uk.iatom.rfm69.register.IRegisterValue

/**
 * RegFrf (MHz) - carrier frequency
 */
data class CarrierFrf(
        val msb: Msb = Msb.MHz915,
        val mid: Mid = Mid.MHz915,
        val lsb: Lsb = Lsb.MHz915
                     ) {


    class GroupCodec: IRegisterGroup.IGroupCodec<CarrierFrf> {


        override fun unpack(e: CarrierFrf): List<*> {
            return listOf(
                    e.msb,
                    e.mid,
                    e.lsb
                         )
        }

        override fun pack(r: List<*>): CarrierFrf {
            return CarrierFrf(
                    r[0] as Msb,
                    r[1] as Mid,
                    r[2] as Lsb
                             )
        }
    }

    enum class Msb(val v: Int): IRegisterValue {


        MHz314(0x4E),
        MHz315(0x4E),
        MHz316(0x4F),
        MHz433(0x6C),
        MHz434(0x6C),
        MHz435(0x6C),
        MHz863(0xD7),
        MHz864(0xD8),
        MHz865(0xD8),
        MHz866(0xD8),
        MHz867(0xD8),
        MHz868(0xD9),
        MHz869(0xD9),
        MHz870(0xD9),
        MHz902(0xE1),
        MHz903(0xE1),
        MHz904(0xE2),
        MHz905(0xE2),
        MHz906(0xE2),
        MHz907(0xE2),
        MHz908(0xE3),
        MHz909(0xE3),
        MHz910(0xE3),
        MHz911(0xE3),
        MHz912(0xE4),
        MHz913(0xE4),
        MHz914(0xE4),
        MHz915(0xE4), // Default MHz916(0xE5),
        MHz917(0xE5),
        MHz918(0xE5),
        MHz919(0xE5),
        MHz920(0xE6),
        MHz921(0xE6),
        MHz922(0xE6),
        MHz923(0xE6),
        MHz924(0xE7),
        MHz925(0xE7),
        MHz926(0xE7),
        MHz927(0xE7),
        MHz928(0xE8);

        override fun getByte(): Byte {
            return v.toByte()
        }
    }

    enum class Mid(val v: Int): IRegisterValue {


        MHz314(0x80),
        MHz315(0xC0),
        MHz316(0x00),
        MHz433(0x40),
        MHz434(0x80),
        MHz435(0xC0),
        MHz863(0xC0),
        MHz864(0x00),
        MHz865(0x40),
        MHz866(0x80),
        MHz867(0xC0),
        MHz868(0x00),
        MHz869(0x40),
        MHz870(0x80),
        MHz902(0x80),
        MHz903(0xC0),
        MHz904(0x00),
        MHz905(0x40),
        MHz906(0x80),
        MHz907(0xC0),
        MHz908(0x00),
        MHz909(0x40),
        MHz910(0x80),
        MHz911(0xC0),
        MHz912(0x00),
        MHz913(0x40),
        MHz914(0x80),
        MHz915(0xC0), // Default
        MHz916(0x00),
        MHz917(0x40),
        MHz918(0x80),
        MHz919(0xC0),
        MHz920(0x00),
        MHz921(0x40),
        MHz922(0x80),
        MHz923(0xC0),
        MHz924(0x00),
        MHz925(0x40),
        MHz926(0x80),
        MHz927(0xC0),
        MHz928(0x00);

        override fun getByte(): Byte {
            return v.toByte()
        }
    }

    enum class Lsb(val v: Int): IRegisterValue {


        MHz314(0x00),
        MHz315(0x00),
        MHz316(0x00),
        MHz433(0x00),
        MHz434(0x00),
        MHz435(0x00),
        MHz863(0x00),
        MHz864(0x00),
        MHz865(0x00),
        MHz866(0x00),
        MHz867(0x00),
        MHz868(0x00),
        MHz869(0x00),
        MHz870(0x00),
        MHz902(0x00),
        MHz903(0x00),
        MHz904(0x00),
        MHz905(0x00),
        MHz906(0x00),
        MHz907(0x00),
        MHz908(0x00),
        MHz909(0x00),
        MHz910(0x00),
        MHz911(0x00),
        MHz912(0x00),
        MHz913(0x00),
        MHz914(0x00),
        MHz915(0x00), // Default
        MHz916(0x00),
        MHz917(0x00),
        MHz918(0x00),
        MHz919(0x00),
        MHz920(0x00),
        MHz921(0x00),
        MHz922(0x00),
        MHz923(0x00),
        MHz924(0x00),
        MHz925(0x00),
        MHz926(0x00),
        MHz927(0x00),
        MHz928(0x00);

        override fun getByte(): Byte {
            return v.toByte()
        }
    }
}
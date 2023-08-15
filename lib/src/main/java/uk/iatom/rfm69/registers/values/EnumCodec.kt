package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.ICodec
import uk.iatom.rfm69.registers.IRegisterValue

class EnumCodec<V>(private val clazz: Class<V>): ICodec<V> where V: Enum<V>, V: IRegisterValue {


    override fun encode(value: V): Byte = value.`val`()

    override fun decode(byte: Byte): V {
        return clazz.enumConstants.first {
            it.`val`() == byte
        }
    }
}
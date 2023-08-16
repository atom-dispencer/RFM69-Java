package uk.iatom.rfm69.register

import kotlin.reflect.KClass

class EnumCodec<V>(private val clazz: KClass<V>): ICodec<V> where V: Enum<V>, V: IRegisterValue {


    override fun encode(value: V): Byte = value.getByte()

    override fun decode(byte: Byte): V {
        return clazz.java.enumConstants.first {
            it.getByte() == byte
        }
    }
}
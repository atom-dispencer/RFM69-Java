package uk.iatom.rfm69.register

class EnumCodec<V>(private val clazz: Class<V>): ICodec<V> where V: Enum<V>, V: IRegisterValue {


    override fun encode(value: V): Byte = value.getByte()

    override fun decode(byte: Byte): V {
        return clazz.enumConstants.first {
            it.getByte() == byte
        }
    }
}
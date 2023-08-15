package uk.iatom.rfm69.registers

interface ICodec<V: IRegisterValue> {


    fun encode(value: V): Byte
    fun decode(byte: Byte): V
}
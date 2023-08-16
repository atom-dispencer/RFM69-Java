package uk.iatom.rfm69.register

interface ICodec<V> {


    fun encode(value: V): Byte
    fun decode(byte: Byte): V
}
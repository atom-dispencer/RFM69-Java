package uk.iatom.rfm69.register;

class ByteRegisterValue(val byte: Byte): IRegisterValue {


    override fun getByte(): Byte = byte
}

class ByteCodec: ICodec<ByteRegisterValue> {


    override fun encode(value: ByteRegisterValue): Byte = value.getByte()

    override fun decode(byte: Byte): ByteRegisterValue = ByteRegisterValue(byte)
}
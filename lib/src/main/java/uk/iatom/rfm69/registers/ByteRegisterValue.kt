package uk.iatom.rfm69.registers;

class ByteRegisterValue(val byte: Byte): IRegisterValue {


    override fun `val`(): Byte = byte
}

class ByteCodec: ICodec<ByteRegisterValue> {


    override fun encode(value: ByteRegisterValue): Byte = value.`val`()

    override fun decode(byte: Byte): ByteRegisterValue = ByteRegisterValue(byte)
}
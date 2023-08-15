package uk.iatom.rfm69.registers

interface IRegister<V: IRegisterValue> {
    fun write(value: V)
    fun read(): V
}

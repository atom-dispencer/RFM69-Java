package uk.iatom.rfm69.register

interface IRegister<V: IRegisterValue> {


    fun write(value: V)
    fun read(): V
}

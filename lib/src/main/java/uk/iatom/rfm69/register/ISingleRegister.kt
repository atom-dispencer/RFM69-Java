package uk.iatom.rfm69.register

interface ISingleRegister<V: IRegisterValue> {


    fun write(value: V)
    fun read(): V
}

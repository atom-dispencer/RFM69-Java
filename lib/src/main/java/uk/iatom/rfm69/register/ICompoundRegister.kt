package uk.iatom.rfm69.register

interface ICompoundRegister<V: IRegisterValue> {


    fun write(vararg values: V)
    fun read(): List<V>
}

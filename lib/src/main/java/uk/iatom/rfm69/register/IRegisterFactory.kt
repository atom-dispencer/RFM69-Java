package uk.iatom.rfm69.register

import uk.iatom.rfm69.IPeripheral

interface IRegisterFactory {


    val peripheral: IPeripheral
    val registers: List<ISingleRegister<*>>

    fun <V: IRegisterValue> single(
            codec: ICodec<V>,
            address: Byte
                                  ): ISingleRegister<V>

    fun <V: IRegisterValue> compound(
            vararg registers: ISingleRegister<V>
                                    ): ICompoundRegister<V>
}
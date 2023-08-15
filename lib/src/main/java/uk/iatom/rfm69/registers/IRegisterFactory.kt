package uk.iatom.rfm69.registers

import uk.iatom.rfm69.IPeripheral

interface IRegisterFactory {


    val peripheral: IPeripheral
    val registers: List<IRegister<*>>

    fun <V: IRegisterValue> create(
            codec: ICodec<V>,
            address: Byte
                                  ): IRegister<V>
}
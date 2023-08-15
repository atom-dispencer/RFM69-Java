package uk.iatom.rfm69.registers

import uk.iatom.rfm69.IPeripheral

class SingleRegisterFactory(override val peripheral: IPeripheral): IRegisterFactory {


    override val registers = mutableListOf<IRegister<*>>()

    override fun <V: IRegisterValue> create(
            codec: ICodec<V>,
            address: Byte
                                           ): IRegister<V> {
        return SingleRegister(
                codec,
                peripheral,
                address
                             ).also { registers.add(it) }
    }
}
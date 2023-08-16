package uk.iatom.rfm69.register

import uk.iatom.rfm69.IPeripheral

class SimpleRegisterFactory(override val peripheral: IPeripheral): IRegisterFactory {


    override val registers = mutableListOf<ISingleRegister<*>>()

    override fun <V: IRegisterValue> single(
            codec: ICodec<V>,
            address: Byte
                                           ): ISingleRegister<V> {
        return SimpleSingleRegister(
                codec,
                peripheral,
                address
                                   ).also { registers.add(it) }
    }
}
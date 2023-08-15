package uk.iatom.rfm69.registers

import uk.iatom.rfm69.IPeripheral
import uk.iatom.rfm69.registers.values.IRegisterFactory

class SingleRegisterFactory: IRegisterFactory {


    override fun <V: IRegisterValue> create(
            codec: ICodec<V>,
            peripheral: IPeripheral,
            address: Byte
                                           ): IRegister<V> {
        return SingleRegister(codec, peripheral, address)
    }
}
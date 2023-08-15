package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.IPeripheral
import uk.iatom.rfm69.registers.ICodec
import uk.iatom.rfm69.registers.IRegister
import uk.iatom.rfm69.registers.IRegisterValue

interface IRegisterFactory {


    fun <V: IRegisterValue> create(
            codec: ICodec<V>,
            peripheral: IPeripheral,
            address: Byte
                                  ): IRegister<V>
}
package uk.iatom.rfm69.register

import uk.iatom.rfm69.IPeripheral

class SimpleRegisterFactory(override val peripheral: IPeripheral): IRegister.Factory {


    override val registers = mutableListOf<IRegister>()
    override fun newRegister(address: Byte): IRegister {
        return SimpleRegister(
                peripheral,
                address
                             ).also { registers.add(it) }
    }
}
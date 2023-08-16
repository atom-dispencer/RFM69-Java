package uk.iatom.rfm69.register

import uk.iatom.rfm69.IPeripheral

interface IRegister {


    fun write(value: Byte)
    fun read(): Byte

    interface Factory {


        val peripheral: IPeripheral
        val registers: List<IRegister>

        fun newRegister(
                address: Byte
                       ): IRegister
    }
}

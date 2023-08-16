package uk.iatom.rfm69.register.values

import uk.iatom.rfm69.register.ICompoundRegister
import uk.iatom.rfm69.register.IRegisterValue
import uk.iatom.rfm69.register.ISingleRegister

class SimpleCompoundRegister<V: IRegisterValue>(vararg registers: ISingleRegister<V>):
        ICompoundRegister<V> {


    private val registers: List<ISingleRegister<V>>

    init {
        this.registers = registers.toList()
    }

    override fun write(vararg values: V) {
        if (values.size != registers.size) throw IndexOutOfBoundsException(
                "Arguments for SimpleCompoundRegister.write must be the same length as the size " + "of the register. Expected ${registers.size}, found ${values.size}."
                                                                          )
        for ((i, v) in values.withIndex()) {
            registers[i].write(v)
        }
    }

    override fun read(): List<V> {
        return registers
                .stream()
                .map { it.read() }
                .toList()
    }
}
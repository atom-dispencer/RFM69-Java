package uk.iatom.rfm69.register

import java.lang.ClassCastException

class SimpleRegisterGroup<V: Any>(
        val codec: IRegisterGroup.IGroupCodec<V>,
        vararg val bindings: IRegisterBinding<V>
                                 ): IRegisterGroup<V> {


    @Suppress("UNCHECKED_CAST") override fun groupWrite(value: V) {
        val mysterySet = codec.unpack(value)

        if (mysterySet.size != bindings.size) throw IndexOutOfBoundsException("Size must match!")

        bindings.forEachIndexed { i, b ->
            val item: Any = mysterySet[i] ?: throw NullPointerException("Mystery set item null!")
            b.writeEncoded(item as V? ?: throw ClassCastException("Silly boy casting wrong!"))
        }
    }

    override fun groupRead(): V {
        val mysteries: List<Any> = bindings.map { it.readEncoded() } // Needs V: Any to work???
        return codec.pack(mysteries)
    }
}
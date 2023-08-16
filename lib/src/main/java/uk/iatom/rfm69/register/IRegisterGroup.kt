package uk.iatom.rfm69.register

interface IRegisterGroup<V> {


    fun groupWrite(value: V)
    fun groupRead(): V

    interface Factory {


        val groups: List<IRegisterGroup<*>>


        /**
         * @param V The type of the object which will be the "front" of this group.
         */
        fun <V> newGroup(
                codec: IGroupCodec<V>,
                vararg bindings: IRegisterBinding<*>
                        ): IRegisterGroup<V>
    }

    interface IGroupCodec<E> {


        /**
         * Convert E into a list of its properties.
         * Another name would be 'serializing'.
         * The list must be ordered so that re-packing will result in an equivalent E.
         */
        fun unpack(e: E): List<*>


        /**
         * Take a list of mystery objects which represent E and convert them into an instance of E.
         * Another name would be 'deserializing'.
         * The list must be ordered so that unpacking will result in an equivalent list of properties.
         */
        fun pack(r: List<*>): E
    }
}

package uk.iatom.rfm69.register

interface IRegisterBinding<V> {


    val register: IRegister
    val codec: ICodec<V>

    fun writeEncoded(v: V)
    fun readEncoded(): V

    interface Factory {


        fun <V> newBinding(
                codec: ICodec<V>,
                register: IRegister
                          ): IRegisterBinding<V>
    }
}
package uk.iatom.rfm69.register

class SimpleRegisterGroupFactory: IRegisterGroup.Factory {


    override val groups = mutableListOf<IRegisterGroup<*>>()
    override fun <V> newGroup(
            codec: IRegisterGroup.IGroupCodec<V>,
            vararg bindings: IRegisterBinding<*>
                             ): IRegisterGroup<V> {
        TODO("Not yet implemented")
    }
}
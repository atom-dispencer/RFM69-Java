package uk.iatom.rfm69

interface IDataBus {


    fun setActive(active: Boolean)
    fun read(vararg outputBuffer: Byte?)
    fun write(vararg inputBuffer: Byte?)
    fun transfer(vararg inputOutputBuffer: Byte?)
}

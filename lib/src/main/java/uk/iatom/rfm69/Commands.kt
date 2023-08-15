package uk.iatom.rfm69

object Commands {


    @JvmStatic fun writeAddr(address: Byte): Byte {
        return (address.toInt() or 0x7F).toByte()
    }

    @JvmStatic fun readAddr(address: Byte): Byte {
        return (address.toInt() or 0x80).toByte()
    }
}

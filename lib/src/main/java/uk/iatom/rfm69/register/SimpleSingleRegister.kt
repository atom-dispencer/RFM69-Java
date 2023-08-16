package uk.iatom.rfm69.register

import uk.iatom.rfm69.Commands
import uk.iatom.rfm69.IDataBus
import uk.iatom.rfm69.IPeripheral
import java.util.*

class SimpleSingleRegister<T: IRegisterValue>(
        private val codec: ICodec<T>,
        val chip: IPeripheral?,
        val address: Byte
                                             ): ISingleRegister<T> {


    override fun write(value: T) {
        chip!!.transact { bus: IDataBus ->
            bus.write(Commands.writeAddr(address))
            bus.write(codec.encode(value))
        }
    }

    override fun read(): T {
        val out = arrayOf<Byte>(0)
        chip!!.transact { bus: IDataBus ->
            bus.write(Commands.readAddr(address))
            bus.read(*out)
        }
        return codec.decode(out[0])
    }

    companion object {


        @JvmStatic fun <V: IRegisterValue?> helpDecodeEnum(
                values: Array<V>?,
                b: Byte
                                                          ): V {
            return Arrays
                    .stream(values)
                    .filter { v: V -> v!!.`val`() == b }
                    .findFirst()
                    .orElseThrow { NullPointerException("") }
        }
    }
}

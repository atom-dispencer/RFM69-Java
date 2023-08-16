package uk.iatom.rfm69.register

import uk.iatom.rfm69.Commands
import uk.iatom.rfm69.IDataBus
import uk.iatom.rfm69.IPeripheral
import java.util.*

class SimpleRegister(
        val chip: IPeripheral?,
        val address: Byte
                    ): IRegister {


    override fun write(value: Byte) {
        chip!!.transact { bus: IDataBus ->
            bus.write(Commands.writeAddr(address))
            bus.write(value)
        }
    }

    override fun read(): Byte {
        val out = arrayOf<Byte>(0)
        chip!!.transact { bus: IDataBus ->
            bus.write(Commands.readAddr(address))
            bus.read(*out)
        }
        return out[0]
    }
}

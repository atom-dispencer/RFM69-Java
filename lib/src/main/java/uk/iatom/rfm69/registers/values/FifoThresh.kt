package uk.iatom.rfm69.registers.values

import uk.iatom.rfm69.registers.IRegisterValue
import uk.iatom.rfm69.registers.SingleRegister.Companion.helpDecodeEnum
import java.util.*
import java.util.function.*
import java.util.stream.*

/**
 * Binding for RegFifoThresh
 */
enum class FifoThresh(`val`: Int): IRegisterValue {


    TXSTART_FIFOTHRESH(0x00),


    // Reset value
    TXSTART_FIFONOTEMPTY(0x80),


    // Recommended default
    DEFAULT(0x0F);

    private val `val`: Byte

    init {
        this.`val` = `val`.toByte()
    }

    override fun `val`(): Byte {
        return `val`
    }

    companion object {


        // Default
        var inverse = Arrays
                .stream<FifoThresh?>(entries.toTypedArray())
                .collect(
                        Collectors.groupingBy<FifoThresh?, Byte, Any, FifoThresh?>(
                                Function<FifoThresh?, Byte> { f: FifoThresh? -> f!!.`val` },
                                Collectors.reducing<FifoThresh?>(
                                        null,
                                        BinaryOperator<FifoThresh?> { a: FifoThresh?, b: FifoThresh? -> b })
                                                                                  )
                        ).values
                .stream()
                .toArray<FifoThresh> { _Dummy_.__Array__() }

        fun encode(fifo: FifoThresh): Byte {
            return fifo.`val`
        }

        fun decode(b: Byte?): FifoThresh {
            return helpDecodeEnum(
                    entries.toTypedArray(),
                    b!!
                                 )
        }
    }
}

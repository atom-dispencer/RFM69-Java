package uk.iatom.rfm69.registers.values;

import java.util.Arrays;
import java.util.stream.Collectors;

import uk.iatom.rfm69.registers.IRegisterValue;
import uk.iatom.rfm69.registers.SingleRegister;

/**
 * Binding for RegFifoThresh
 */
public enum FifoThresh implements IRegisterValue {
    TXSTART_FIFOTHRESH(0x00), // Reset value
    TXSTART_FIFONOTEMPTY(0x80), // Recommended default
    DEFAULT(0x0F); // Default

    public static FifoThresh[] inverse = Arrays.stream(values())
            .collect(Collectors.groupingBy(f -> f.val, Collectors.reducing(null, (a, b) -> b)))
            .values().stream()
            .toArray(FifoThresh[]::new);

    private byte val;

    FifoThresh(int val) {
        this.val = (byte) val;
    }

    @Override
    public byte val() {
        return val;
    }

    public static Byte encode(FifoThresh fifo) {
        return fifo.val;
    }

    public static FifoThresh decode(Byte b) {
        return SingleRegister.helpDecodeEnum(values(), b);
    }
}

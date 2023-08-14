package uk.iatom.rfm69.registers;

import java.util.Arrays;
import java.util.function.Function;

import uk.iatom.rfm69.Commands;
import uk.iatom.rfm69.IPeripheral;

public class SingleRegister<T> implements IRegister<T> {

    public static <V extends IRegisterValue> V helpDecodeEnum(V[] values, Byte b) {
        return Arrays
                .stream(values)
                .filter((v) -> v.val() == b.byteValue()).findFirst()
                .orElseThrow(() -> new NullPointerException(""));
    }

    private Function<T, Byte> encode;
    private Function<Byte, T> decode;
    private IPeripheral chip;
    private byte address;

    public SingleRegister(
            Function<T, Byte> encode,
            Function<Byte, T> decode,
            IPeripheral chip,
            int address) {
        this.encode = encode;
        this.decode = decode;
        this.chip = chip;
        this.address = (byte) address;
    }

    public IPeripheral getChip() {
        return chip;
    }

    public byte getAddress() {
        return address;
    }

    public void write(T value) {
        chip.transact((bus) -> {
            bus.write(Commands.writeAddr(address));
            bus.write(encode.apply(value));
        });
    }

    public T read() {
        Byte[] out = new Byte[1];
        chip.transact((bus) -> {
            bus.write(Commands.readAddr(address));
            bus.read(out);
        });
        return decode.apply(out[0]);
    }
}

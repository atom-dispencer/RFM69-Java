package uk.iatom.rfm69.registers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import uk.iatom.rfm69.Commands;
import uk.iatom.rfm69.IPeripheral;

public class CompoundRegister<T> implements IRegister<T> {

    public static <V extends IRegisterValue> List<V> helpDecodeEnum(V[] values, Byte[] arr) {
        return Arrays
                .stream(arr)
                .parallel()
                .map(b -> SingleRegister.helpDecodeEnum(values, b))
                .toList();
    }

    private Function<T, List<Byte>> encode;
    private Function<List<Byte>, T> decode;
    private IPeripheral chip;
    private byte startAddress;
    private byte endAddress;

    public CompoundRegister(
            Function<T, List<Byte>> encode,
            Function<List<Byte>, T> decode,
            IPeripheral chip,
            byte startAddress,
            byte endAddress) {
        this.encode = encode;
        this.decode = decode;
        this.chip = chip;
        this.startAddress = startAddress;
        this.endAddress = endAddress;
    }

    public IPeripheral getChip() {
        return chip;
    }

    public byte getStartAddress() {
        return startAddress;
    }

    public byte getEndAddress() {
        return endAddress;
    }

    public int getSize() {
        return endAddress - startAddress;
    }

    public void write(T value) {
        Byte[] msg = encode
                .apply(value)
                .stream()
                .toList()
                .toArray(new Byte[0]);

        if (msg.length != getSize()) {
            throw new IndexOutOfBoundsException(
                    "Cannot set register value to a value longer than the allocated register space!");
        }

        chip.transact((bus) -> {
            for (int i = 0; i < msg.length; i++) {
                bus.write(Commands.writeAddr((byte) (startAddress + i)));
                bus.write(msg);
            }
        });
    }

    public T read() {
        Byte[] read = new Byte[1];
        List<Byte> out = new ArrayList<>();

        chip.transact((bus) -> {
            for (int i = 0; i < getSize(); i++) {
                read[0] = 0;
                bus.write(Commands.readAddr((byte) (startAddress + i)));
                bus.read(read);
                out.add(read[0]);
            }
        });
        return decode.apply(out);
    }
}

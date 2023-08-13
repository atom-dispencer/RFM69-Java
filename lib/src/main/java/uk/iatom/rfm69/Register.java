package uk.iatom.rfm69;

public class Register<T extends IRegisterValue> {
    private IPeripheral chip;
    private byte address;

    public Register(IPeripheral chip, byte address) {
        this.chip = chip;
        this.address = address;
    }

    public IPeripheral getChip() {
        return chip;
    }

    public byte getAddress() {
        return address;
    }

    public void write(T value) {
        chip.transact((transaction) -> {
            transaction.write(Commands.writeAddr(address));
            transaction.write(value.getValue());
        });
    }

    public T read() {
        byte[] out = new byte[1];
        chip.transact((transaction) -> {
            transaction.write(Commands.readAddr(address));
            transaction.read(out);
        });
        return out[0];
    }
}

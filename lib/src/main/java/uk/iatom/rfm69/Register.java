package uk.iatom.rfm69;

public class Register {
    private IDataBus bus;
    private byte address;

    public Register(IDataBus spi, byte address) {
        this.bus = spi;
        this.address = address;
    }

    public IDataBus getBus() {
        return bus;
    }

    public byte getAddress() {
        return address;
    }

    public void write(byte value) {
        bus.write(Commands.writeAddr(address));
        bus.write(value);
    }

    public byte read() {
        bus.write(Commands.readAddr(address));

        byte[] out = new byte[1];
        bus.read(out);
        return out[0];
    }
}

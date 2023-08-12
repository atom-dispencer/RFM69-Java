package uk.iatom.rfm69;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegisterTest {

    private MockDataBus bus;
    private Register register;

    @BeforeEach
    void beforeEach() {
        bus = new MockDataBus((byte) 0xaf);
        register =  new Register(bus, (byte) 0xd3);
    }

    @Test
    void read_ReadsDefaultValue() {
        byte out = register.read();
        assertEquals(bus.defaultReadValue, out);
    }

    @Test
    void write_WritesAddress() {
        byte address = 'x';
        register = new Register(bus, address);

        byte toWrite = 'x';
        register.write(toWrite);
        assertEquals(Commands.writeAddr(address), bus.writtenValues.get(0), () -> "Incorrect address written.");
    }

    @Test
    void write_WritesValue() {
        byte value = 'x';
        register.write(value);
        assertEquals(value, bus.writtenValues.get(1), () -> "Incorrect value written.");
    }

    @Test
    void write_Writes2Chars() {
        byte toWrite = 'x';
        register.write(toWrite);
        assertEquals(2, bus.writtenValues.size(), () -> "Did not write exactly 2 chars.");
    }

    @Test
    void read_WritesAddress() {
        byte address = 'g';
        register = new Register(bus, address);

        register.read();
        assertEquals(Commands.readAddr(address), bus.writtenValues.get(0), () -> "Incorrect address written.");
    }
}

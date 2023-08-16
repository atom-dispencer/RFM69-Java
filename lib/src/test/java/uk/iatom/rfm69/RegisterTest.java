package uk.iatom.rfm69;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.iatom.rfm69.register.SimpleRegister;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest {

    private MockPeripheral chip;
    private SimpleRegister register;

    @BeforeEach
    void beforeEach() {
        MockDataBus bus = new MockDataBus((byte) 0xaf);
        chip = new MockPeripheral(bus);
        register = new SimpleRegister(chip, (byte) 0xd3);
    }

    //TODO Need to test setting of active bit during transactions!!

    @Test
    void read_ReadsDefaultValue() {
        byte out = register.read();
        assertEquals(chip.bus.defaultReadValue, out);
    }

    @Test
    void write_WritesAddress() {
        byte address = 'x';
        register = new SimpleRegister(chip, address);

        byte toWrite = 'x';
        register.write(toWrite);
        assertEquals(Commands.writeAddr(address), chip.bus.writtenValues.get(0), () -> "Incorrect address written.");
    }

    @Test
    void write_WritesValue() {
        byte value = 'x';
        register.write(value);
        assertEquals(value, chip.bus.writtenValues.get(1), () -> "Incorrect value written.");
    }

    @Test
    void write_Writes2Chars() {
        byte toWrite = 'x';
        register.write(toWrite);
        assertEquals(2, chip.bus.writtenValues.size(), () -> "Did not write exactly 2 chars.");
    }

    @Test
    void read_WritesAddress() {
        byte address = 'g';
        register = new SimpleRegister(chip, address);

        register.read();
        assertEquals(Commands.readAddr(address), chip.bus.writtenValues.get(0), () -> "Incorrect address written.");
    }
}

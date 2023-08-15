package uk.iatom.rfm69;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockDataBus implements IDataBus {

    public byte defaultReadValue;
    public List<Byte> writtenValues;
    public boolean active;

    public MockDataBus(byte defaultReadValue) {
        this.defaultReadValue = defaultReadValue;
        this.writtenValues = new ArrayList<>();
        this.active = false;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void read(byte... outputBuffer) {
        Arrays.fill(outputBuffer, defaultReadValue);
    }

    @Override
    public void write(byte... data) {
        for (byte b : data) {
            writtenValues.add(b);
        }
    }

    @Override
    public void transfer(byte... data) {
        for (byte b : data) {
            writtenValues.add(b);
        }

        System.arraycopy(data, 0, writtenValues, 0, data.length);
        Arrays.fill(data, defaultReadValue);
    }

}

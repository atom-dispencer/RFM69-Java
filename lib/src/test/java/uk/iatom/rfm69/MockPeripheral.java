package uk.iatom.rfm69;

import java.util.function.Consumer;

public class MockPeripheral implements IPeripheral {
    public MockDataBus bus;

    public MockPeripheral(MockDataBus bus) {
        this.bus = bus;
    }

    @Override
    public void transact(Consumer<IDataBus> transaction) {
        bus.setActive(true);
        transaction.accept(bus);
        bus.setActive(false);
    }

}

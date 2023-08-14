package uk.iatom.rfm69;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface IPeripheral {

    /**
     * Perform a series of communications with the external device (peripheral)
     * associated with this object. This should also handle 'boring' tasks like
     * setting chip selects. For example, you might send 5 bytes and recieve 3
     * bytes.
     * 
     * @param bus The bus upon which to perform the transaction.
     */
    CompletableFuture<?> transact(Consumer<IDataBus> bus);
}
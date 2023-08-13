package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum FifoThresh implements IRegisterValue {
        // RegFifoThresh),
        TXSTART_FIFOTHRESH(0x00), // Reset value),
        TXSTART_FIFONOTEMPTY(0x80), // Recommended default),
    
        VALUE(0x0F); // Default),;

        private byte val;
        
        FifoThresh(int val) {
            this.val = (byte) val;
        }
    
        @Override public byte val() {
            return val;
        }
}

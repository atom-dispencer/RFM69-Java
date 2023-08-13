package uk.iatom.rfm69.registers;

public enum FifoThresh {
        // RegFifoThresh),
        TXSTART_FIFOTHRESH(0x00), // Reset value),
        TXSTART_FIFONOTEMPTY(0x80), // Recommended default),
    
        VALUE(0x0F); // Default),;

        private byte val;
        
        FifoThresh(int val) {
            this.val = (byte) val;
        }
    
        public byte getVal() {
            return val;
        }
}

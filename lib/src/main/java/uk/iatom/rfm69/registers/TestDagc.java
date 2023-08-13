package uk.iatom.rfm69.registers;

public enum TestDagc {
        // RegTestDagc),
        NORMAL(0x00), // Reset value),
        IMPROVED_LOWBETA1(0x20),
        IMPROVED_LOWBETA0(0x30); // Recommended default),;

        private byte val;
        
        TestDagc(int val) {
            this.val = (byte) val;
        }
    
        public byte getVal() {
            return val;
        }
}

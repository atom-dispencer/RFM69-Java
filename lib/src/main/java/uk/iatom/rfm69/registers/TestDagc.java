package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum TestDagc implements IRegisterValue {
        // RegTestDagc),
        NORMAL(0x00), // Reset value),
        IMPROVED_LOWBETA1(0x20),
        IMPROVED_LOWBETA0(0x30); // Recommended default),;

        private byte val;
        
        TestDagc(int val) {
            this.val = (byte) val;
        }
    
        @Override public byte val() {
            return val;
        }
}

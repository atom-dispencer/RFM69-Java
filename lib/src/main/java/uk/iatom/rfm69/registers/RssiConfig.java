package uk.iatom.rfm69.registers;

public enum RssiConfig {
        // RegRssiConfig),
        FASTRX_ON(0x08), // not present on RFM69/SX1231),
        FASTRX_OFF(0x00), // Default),
    
        DONE(0x02),
        START(0x01);

        private byte val;
        
        RssiConfig(int val) {
            this.val = (byte) val;
        }
    
        public byte getVal() {
            return val;
        }
}

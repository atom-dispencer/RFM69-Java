package uk.iatom.rfm69.magicbytes;

public enum AfcFei {
        // RegAfcFei),
        AFCFEI_FEI_DONE(0x40),
        AFCFEI_FEI_START(0x20),
        AFCFEI_AFC_DONE(0x10),
        AFCFEI_AFCAUTOCLEAR_ON(0x08),
        AFCFEI_AFCAUTOCLEAR_OFF(0x00), // Default),

        AFCFEI_AFCAUTO_ON(0x04),
        AFCFEI_AFCAUTO_OFF(0x00), // Default),

        AFCFEI_AFC_CLEAR(0x02),
        AFCFEI_AFC_START(0x01);

        private byte val;

        AfcFei(int val) {
                this.val = (byte) val;
        }

        public byte getVal() {
                return val;
        }
}

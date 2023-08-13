package uk.iatom.rfm69.registers;

public enum DataModulations {
    
    // RegDataModul),
    RF_DATAMODUL_DATAMODE_PACKET(0x00), // Default),
    RF_DATAMODUL_DATAMODE_CONTINUOUS(0x40),
    RF_DATAMODUL_DATAMODE_CONTINUOUSNOBSYNC(0x60),
    RF_DATAMODUL_MODULATIONTYPE_FSK(0x00), // Default),
    RF_DATAMODUL_MODULATIONTYPE_OOK(0x08),
    RF_DATAMODUL_MODULATIONSHAPING_00(0x00), // Default),
    RF_DATAMODUL_MODULATIONSHAPING_01(0x01),
    RF_DATAMODUL_MODULATIONSHAPING_10(0x02),
    RF_DATAMODUL_MODULATIONSHAPING_11(0x03);

    private byte val;
    
    DataModulations(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

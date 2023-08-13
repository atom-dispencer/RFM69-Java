package uk.iatom.rfm69.magicbytes;

public enum SyncConfig {
    // RegSyncConfig),
    ON(0x80), // Default),
    OFF(0x00),
    FIFOFILL_AUTO(0x00), // Default -- when sync interrupt occurs),
    FIFOFILL_MANUAL(0x40),
    SIZE_1(0x00),
    SIZE_2(0x08),
    SIZE_3(0x10),
    SIZE_4(0x18), // Default),
    SIZE_5(0x20),
    SIZE_6(0x28),
    SIZE_7(0x30),
    SIZE_8(0x38),
    TOL_0(0x00), // Default),
    TOL_1(0x01),
    TOL_2(0x02),
    TOL_3(0x03),
    TOL_4(0x04),
    TOL_5(0x05),
    TOL_6(0x06),
    TOL_7(0x07),
    // RegSyncValue1-8),
    BYTE1_VALUE(0x00), // Default),
    BYTE2_VALUE(0x00), // Default),
    BYTE3_VALUE(0x00), // Default),
    BYTE4_VALUE(0x00), // Default),
    BYTE5_VALUE(0x00), // Default),
    BYTE6_VALUE(0x00), // Default),
    BYTE7_VALUE(0x00), // Default),
    BYTE8_VALUE(0x00); // Default),;

    private byte val;
    
    SyncConfig(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum LowBattery implements IRegisterValue {
    // RegLowBat
    RF_LOWBAT_MONITOR(0x10),
    RF_LOWBAT_ON(0x08),
    RF_LOWBAT_OFF(0x00), // Default

    RF_LOWBAT_TRIM_1695(0x00),
    RF_LOWBAT_TRIM_1764(0x01),
    RF_LOWBAT_TRIM_1835(0x02), // Default
    RF_LOWBAT_TRIM_1905(0x03),
    RF_LOWBAT_TRIM_1976(0x04),
    RF_LOWBAT_TRIM_2045(0x05),
    RF_LOWBAT_TRIM_2116(0x06),
    RF_LOWBAT_TRIM_2185(0x07);

    private byte val;
    
    LowBattery(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

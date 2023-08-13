package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum Listen1 implements IRegisterValue {
    // RegListen1
    RESOL_64(0x50),
    RESOL_4100(0xA0), // Default
    RESOL_262000(0xF0),
    RESOL_IDLE_64(0x40),
    RESOL_IDLE_4100(0x80), // Default
    RESOL_IDLE_262000(0xC0),
    RESOL_RX_64(0x10),
    RESOL_RX_4100(0x20), // Default
    RESOL_RX_262000(0x30),
    CRITERIA_RSSI(0x00), // Default
    CRITERIA_RSSIANDSYNC(0x08),
    END_00(0x00),
    END_01(0x02), // Default
    END_10(0x04);

    private byte val;
    
    Listen1(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum AfcBws implements IRegisterValue {
    
    // RegAfcBw
    PADCCFREQAFC_000(0x00),
    PADCCFREQAFC_001(0x20),
    PADCCFREQAFC_010(0x40),
    PADCCFREQAFC_011(0x60),
    PADCCFREQAFC_100(0x80), // Default
    PADCCFREQAFC_101(0xA0),
    PADCCFREQAFC_110(0xC0),
    PADCCFREQAFC_111(0xE0),
    PAMANTAFC_16(0x00),
    PAMANTAFC_20(0x08), // Default
    PAMANTAFC_24(0x10),
    PAEXPAFC_0(0x00),
    PAEXPAFC_1(0x01),
    PAEXPAFC_2(0x02), // Reset value
    PAEXPAFC_3(0x03), // Recommended default
    PAEXPAFC_4(0x04),
    PAEXPAFC_5(0x05),
    PAEXPAFC_6(0x06),
    PAEXPAFC_7(0x07);

    private byte val;
    
    AfcBws(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

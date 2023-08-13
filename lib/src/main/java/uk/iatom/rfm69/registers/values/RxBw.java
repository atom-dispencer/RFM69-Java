package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum RxBw implements IRegisterValue {
    
    // RegRxBw),
    DCCFREQ_000(0x00),
    DCCFREQ_001(0x20),
    DCCFREQ_010(0x40), // Recommended default),
    DCCFREQ_011(0x60),
    DCCFREQ_100(0x80), // Reset value),
    DCCFREQ_101(0xA0),
    DCCFREQ_110(0xC0),
    DCCFREQ_111(0xE0),
    MANT_16(0x00), // Reset value),
    MANT_20(0x08),
    MANT_24(0x10), // Recommended default),

    EXP_0(0x00),
    EXP_1(0x01),
    EXP_2(0x02),
    EXP_3(0x03),
    EXP_4(0x04),
    EXP_5(0x05), // Recommended default),
    EXP_6(0x06), // Reset value),
    EXP_7(0x07);

    private byte val;
    
    RxBw(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}

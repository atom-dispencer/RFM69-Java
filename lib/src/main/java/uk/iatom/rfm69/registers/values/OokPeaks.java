package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;
  

public enum OokPeaks implements IRegisterValue {
    
    // RegOokPeak
    THRESHTYPE_FIXED(0x00),
    THRESHTYPE_PEAK(0x40), // Default
    THRESHTYPE_AVERAGE(0x80),
    PEAKTHRESHSTEP_000(0x00), // Default
    PEAKTHRESHSTEP_001(0x08),
    PEAKTHRESHSTEP_010(0x10),
    PEAKTHRESHSTEP_011(0x18),
    PEAKTHRESHSTEP_100(0x20),
    PEAKTHRESHSTEP_101(0x28),
    PEAKTHRESHSTEP_110(0x30),
    PEAKTHRESHSTEP_111(0x38),
    PEAKTHRESHDEC_000(0x00), // Default
    PEAKTHRESHDEC_001(0x01),
    PEAKTHRESHDEC_010(0x02),
    PEAKTHRESHDEC_011(0x03),
    PEAKTHRESHDEC_100(0x04),
    PEAKTHRESHDEC_101(0x05),
    PEAKTHRESHDEC_110(0x06),
    PEAKTHRESHDEC_111(0x07);

    private byte val;
    
    OokPeaks(int val) {
        this.val = (byte) val;
    }

    @Override public byte val() {
        return val;
    }
}
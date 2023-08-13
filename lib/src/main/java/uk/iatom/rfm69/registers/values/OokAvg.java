package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

public enum OokAvg implements IRegisterValue {
     // RegOokAvg),
     AVERAGETHRESHFILT_00(0x00),
     AVERAGETHRESHFILT_01(0x40),
     AVERAGETHRESHFILT_10(0x80), // Default),
     AVERAGETHRESHFILT_11(0xC0);

     private byte val;
     
     OokAvg(int val) {
         this.val = (byte) val;
     }
 
     @Override public byte val() {
         return val;
     }
}

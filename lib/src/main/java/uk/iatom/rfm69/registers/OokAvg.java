package uk.iatom.rfm69.registers;

public enum OokAvg {
     // RegOokAvg),
     AVERAGETHRESHFILT_00(0x00),
     AVERAGETHRESHFILT_01(0x40),
     AVERAGETHRESHFILT_10(0x80), // Default),
     AVERAGETHRESHFILT_11(0xC0);

     private byte val;
     
     OokAvg(int val) {
         this.val = (byte) val;
     }
 
     public byte getVal() {
         return val;
     }
}

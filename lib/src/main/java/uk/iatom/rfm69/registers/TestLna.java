package uk.iatom.rfm69.magicbytes;

public enum TestLna {
       // RegTestLna),
       NORMAL(0x1B),
       HIGH_SENSITIVITY(0x2D);

       private byte val;
       
       TestLna(int val) {
           this.val = (byte) val;
       }
   
       public byte getVal() {
           return val;
       }
}

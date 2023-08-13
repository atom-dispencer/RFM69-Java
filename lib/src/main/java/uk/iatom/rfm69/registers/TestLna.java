package uk.iatom.rfm69.registers; import uk.iatom.rfm69.IRegisterValue;

public enum TestLna implements IRegisterValue {
       // RegTestLna),
       NORMAL(0x1B),
       HIGH_SENSITIVITY(0x2D);

       private byte val;
       
       TestLna(int val) {
           this.val = (byte) val;
       }
   
       @Override public byte val() {
           return val;
       }
}

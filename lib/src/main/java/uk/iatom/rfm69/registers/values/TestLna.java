package uk.iatom.rfm69.registers.values; import uk.iatom.rfm69.registers.IRegisterValue;

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

package uk.iatom.rfm69;

public class Commands {
    
    public static byte writeAddr(byte address) {
        return (byte) (address | 0x7F);
    }

    public static byte readAddr(byte address) {
        return (byte) (address | 0x80);
    }
}

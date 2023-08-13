package uk.iatom.rfm69.magicbytes;

public enum OpModes {
    
    // RegOpMode
    SEQUENCER_OFF(0x80),
    SEQUENCER_ON(0x00), // Default

    LISTEN_ON(0x40),
    LISTEN_OFF(0x00), // Default

    LISTENABORT(0x20),
    SLEEP(0x00),
    STANDBY(0x04), // Default
    SYNTHESIZER(0x08),
    TRANSMITTER(0x0C),
    RECEIVER(0x10);

    private byte val;
    
    OpModes(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

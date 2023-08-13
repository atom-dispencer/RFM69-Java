package uk.iatom.rfm69.magicbytes;

public enum AutoModes {
    // RegAutoModes),
    ENTER_OFF(0x00), // Default),
    ENTER_FIFONOTEMPTY(0x20),
    ENTER_FIFOLEVEL(0x40),
    ENTER_CRCOK(0x60),
    ENTER_PAYLOADREADY(0x80),
    ENTER_SYNCADRSMATCH(0xA0),
    ENTER_PACKETSENT(0xC0),
    ENTER_FIFOEMPTY(0xE0),
    EXIT_OFF(0x00), // Default),
    EXIT_FIFOEMPTY(0x04),
    EXIT_FIFOLEVEL(0x08),
    EXIT_CRCOK(0x0C),
    EXIT_PAYLOADREADY(0x10),
    EXIT_SYNCADRSMATCH(0x14),
    EXIT_PACKETSENT(0x18),
    EXIT_RXTIMEOUT(0x1C),
    INTERMEDIATE_SLEEP(0x00), // Default),
    INTERMEDIATE_STANDBY(0x01),
    INTERMEDIATE_RECEIVER(0x02),
    INTERMEDIATE_TRANSMITTER(0x03);

    private byte val;
    
    AutoModes(int val) {
        this.val = (byte) val;
    }

    public byte getVal() {
        return val;
    }
}

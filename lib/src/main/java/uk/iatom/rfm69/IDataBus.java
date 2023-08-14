package uk.iatom.rfm69;

public interface IDataBus {
    void setActive(boolean active);
    void read(Byte... outputBuffer);
    void write(Byte... inputBuffer);
    void transfer(Byte... inputOutputBuffer);
}

package uk.iatom.rfm69;

public interface IDataBus {
    void read(byte... outputBuffer);
    void write(byte... inputBuffer);
    void transfer(byte... inputOutputBuffer);
}

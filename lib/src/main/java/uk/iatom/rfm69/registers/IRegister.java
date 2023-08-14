package uk.iatom.rfm69.registers;

public interface IRegister<T> {
    void write(T value);
    T read();
}

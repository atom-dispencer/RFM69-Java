package uk.iatom.rfm69;

import java.util.Random;

public class TestUtils {

    static Random random = new Random();

    static char randomChar() {
        return (char) random.nextInt(256);
    }
}

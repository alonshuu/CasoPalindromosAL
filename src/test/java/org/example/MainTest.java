package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testPalabraMinuscula () {
        assertTrue(Main.esPalindromo("reconocer"));
    }
    @Test
    void testPalabraMayuscula () {
        assertTrue(Main.esPalindromo("Reconocer"));
    }
    @Test
    void testFrase () {
        assertTrue(Main.esPalindromo("anita lava la tina"));
    }

}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexoTest {
    Complexo cpx = new Complexo();

    @Test
    void soma() {
        assertEquals(95,cpx.soma(80, 15));
    }

    @Test
    void sub() {
        assertEquals(65,cpx.sub(80, 15));
    }

    @Test
    void modulus() {
        assertEquals(6.4031242374328485,cpx.modulus(4, 5));
    }
}
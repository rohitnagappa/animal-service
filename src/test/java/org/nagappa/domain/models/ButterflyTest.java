package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Animal;

import static org.junit.jupiter.api.Assertions.*;

class ButterflyTest {

    private Animal butterfly;

    private Animal caterpillar;
    @BeforeEach
    void setUp() {
        butterfly = new Butterfly();
        caterpillar = new Butterfly(true);
    }

    @Test
    void fly() {
        assertTrue(butterfly.fly());
        assertFalse(caterpillar.fly());
    }

    @Test
    void walk() {
        assertFalse(butterfly.walk());
        assertTrue(caterpillar.walk());
    }

    @Test
    void sing() {
        assertFalse(butterfly.sing());
        assertFalse(caterpillar.sing());
    }

    @Test
    void swim() {
        assertFalse(butterfly.swim());
        assertFalse(caterpillar.swim());
    }
}
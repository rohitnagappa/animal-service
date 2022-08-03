package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Animal;

import static org.junit.jupiter.api.Assertions.*;

class ButterflyTest {

    private Animal butterfly;
    @BeforeEach
    void setUp() {
        butterfly = new Butterfly();
    }

    @Test
    void fly() {
        assertTrue(butterfly.fly());
    }

    @Test
    void walk() {
        assertFalse(butterfly.walk());
    }

    @Test
    void sing() {
        assertFalse(butterfly.sing());
    }

    @Test
    void swim() {
        assertFalse(butterfly.swim());
    }
}
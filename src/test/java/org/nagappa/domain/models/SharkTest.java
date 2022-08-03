package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Fish;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest {

    private Fish shark;
    @BeforeEach
    void setUp() {
        shark = new Shark();
    }

    @Test
    void fly() {
        assertFalse(shark.fly());
    }

    @Test
    void walk() {
        assertFalse(shark.walk());
    }

    @Test
    void sing() {
        assertFalse(shark.sing());
    }

    @Test
    void swim() {
        assertTrue(shark.swim());
    }

    @Test
    void eat() {
        assertTrue(shark.eat());
    }

    @Test
    void makeJokes() {
        assertFalse(shark.makeJokes());
    }

    @Test
    void size() {
        shark.size();
        String size = ((Shark)shark).getSize();
        assertSame("large",size);

    }

    @Test
    void color() {
        shark.color();
        String color = ((Shark)shark).getColor();
        assertSame("grey",color);
    }
}
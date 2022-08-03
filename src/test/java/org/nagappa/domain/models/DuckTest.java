package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Animal;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    private Animal duck;

    @BeforeEach
    public void setup(){
        duck = new Duck();
    }

    @Test
    void testFly(){
        assertTrue(duck.fly());
    }

    @Test
    void testSing(){
        assertTrue(duck.sing());
    }

    @Test
    void testWalk(){
        assertTrue(duck.walk());
    }

    @Test
    void testSwim(){
        assertTrue(duck.swim());
    }
}
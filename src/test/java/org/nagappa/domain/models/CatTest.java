package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.abs.Animal;
import org.nagappa.domain.models.pets.Cat;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    private Animal cat;

    @BeforeEach
    public void setup(){
        cat = new Cat();
    }

    @Test
    void testFly(){
        assertFalse(cat.fly());
    }

    @Test
    void testWalk(){
        assertTrue(cat.walk());
    }

    @Test
    void testSing(){
        assertTrue(cat.sing());
    }

    @Test
    void testSwim(){
        assertTrue(cat.swim());
    }

}
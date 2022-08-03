package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Animal;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {


    private Animal chicken;

    @BeforeEach
    public void setup(){
        chicken = new Chicken();
    }

    @Test
    void testFly(){
        assertFalse(chicken.fly());
    }

    @Test
    void testSing(){
        assertTrue(chicken.sing());
    }

    @Test
    void testWalk(){
        assertTrue(chicken.walk());
    }

    @Test
    void testSwim(){
        assertFalse(chicken.swim());
    }

}
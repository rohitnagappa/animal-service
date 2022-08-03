package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Animal;

import static org.junit.jupiter.api.Assertions.*;

class RoosterTest {

    private Animal rooster;

    @BeforeEach
    public void setup(){
        rooster = new Rooster();
    }

    @Test
    void testFly(){
        assertFalse(rooster.fly());
    }

    @Test
    void testSing(){
        assertTrue(rooster.sing());
    }

    @Test
    void testWalk(){
        assertTrue(rooster.walk());
    }

    @Test
    void testSwim(){
        assertFalse(rooster.swim());
    }
}
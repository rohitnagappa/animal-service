package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.abs.Animal;
import org.nagappa.domain.models.birds.Rooster;

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
    @Test
    void testRussian(){
        rooster = new Rooster("Russian");
        rooster.sing();
    }

    @Test
    void testDanish(){
        rooster = new Rooster("Danish");
        rooster.sing();
    }

    @Test
    void testDutch(){
        rooster = new Rooster("Dutch");
        rooster.sing();
    }
}
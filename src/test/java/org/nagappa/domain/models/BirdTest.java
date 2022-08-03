package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Animal;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    private Animal bird;

    @BeforeEach
    public void setup(){
        bird = new Bird();
    }

    @Test
    void testFly(){
        assertTrue(bird.fly());
    }
    @Test
    void testWalk(){
        assertTrue(bird.walk());
    }
    @Test
    void testSing(){
        assertTrue(bird.sing());
    }

}
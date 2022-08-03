package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Animal;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTest {

    private Animal parrot;

    @BeforeEach
    public void setup(){
        parrot = new Parrot();
    }

    @Test
    void testFly(){
        assertTrue(parrot.fly());
    }

    @Test
    void testWalk(){
        assertTrue(parrot.walk());
    }

    @Test
    void testSing(){
        assertTrue(parrot.sing());
    }

    @Test
    void testLivingWithDog(){
        parrot = new Parrot(new Dog());
        parrot.sing();
    }

    @Test
    void testLivingWithCat(){
        parrot = new Parrot(new Cat());
        parrot.sing();
    }

    @Test
    void testLivingWithRooster(){
        parrot = new Parrot(new Rooster());
        parrot.sing();
    }

    @Test
    void testLivingWithDuck(){
        parrot = new Parrot(new Duck());
        parrot.sing();
    }

    @Test
    void testSwim(){
        assertFalse(parrot.swim());
    }

}
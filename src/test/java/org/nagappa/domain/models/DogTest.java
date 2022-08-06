package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.abs.Animal;
import org.nagappa.domain.models.pets.Dog;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    private Animal dog;

    @BeforeEach
    public void setup(){
        dog = new Dog();
    }

    @Test
    void testFly(){
        assertFalse(dog.fly());
    }

    @Test
    void testWalk(){
        assertTrue(dog.walk());
    }

    @Test
    void testSing(){
        assertTrue(dog.sing());
    }

    @Test
    void testSwim(){
        assertTrue(dog.swim());
    }

}
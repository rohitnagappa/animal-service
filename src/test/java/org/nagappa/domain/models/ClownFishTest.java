package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Fish;

import static org.junit.jupiter.api.Assertions.*;

class ClownFishTest {

    private Fish clownFish;

    @BeforeEach
    void setUp() {
        clownFish = new ClownFish();
    }

    @Test
    void fly() {
        assertFalse(clownFish.fly());
    }

    @Test
    void walk() {
        assertFalse(clownFish.walk());
    }

    @Test
    void sing() {
        assertFalse(clownFish.sing());
    }

    @Test
    void swim() {
        assertTrue(clownFish.swim());
    }

    @Test
    void eat() {
        assertFalse(clownFish.eat());
    }

    @Test
    void makeJokes() {
        assertTrue(clownFish.makeJokes());
    }

    @Test
    void size() {
        clownFish.size();
        String size = ((ClownFish) clownFish).getSize();
        assertSame("small",size);
    }

    @Test
    void color() {
        clownFish.color();
        String color = ((ClownFish) clownFish).getColor();
        assertSame("orange",color);
    }
}
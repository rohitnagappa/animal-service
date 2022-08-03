package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.ifc.Animal;
import org.nagappa.domain.ifc.Fish;

import static org.junit.jupiter.api.Assertions.*;

class DolphinTest {

    private Animal dolphin;

    @BeforeEach
    public  void setUp(){
        dolphin = new Dolphin(new Fish() {
            @Override
            public boolean eat() {
                return false;
            }

            @Override
            public boolean makeJokes() {
                return false;
            }

            @Override
            public void size() {
                System.out.println("medium");
            }

            @Override
            public void color() {
                System.out.println("blue");
            }

            @Override
            public boolean fly() {
                return false;
            }

            @Override
            public boolean walk() {
                return false;
            }

            @Override
            public boolean sing() {
                return false;
            }

            @Override
            public boolean swim() {
                System.out.println("i am swimming");
                return true;
            }
        });
    }
    @Test
    void fly() {
        assertFalse(dolphin.fly());
    }

    @Test
    void walk() {
        assertFalse(dolphin.walk());
    }

    @Test
    void sing() {
        assertFalse(dolphin.sing());
    }

    @Test
    void swim() {
        assertTrue(dolphin.swim());
    }
}
package org.nagappa.domain.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nagappa.domain.abs.Animal;
import org.nagappa.domain.models.birds.*;
import org.nagappa.domain.models.fish.ClownFish;
import org.nagappa.domain.models.fish.Shark;
import org.nagappa.domain.models.pets.Cat;

import static org.junit.jupiter.api.Assertions.*;

public class CountingAllAnimalTest {

    private Animal[] animals;
    private int count ;

    @BeforeEach
    public void setUp(){
        count = 0;
        animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Shark(),
                new ClownFish(),
                new Butterfly(),
                new Cat()
        };
    }

    @Test
    void testCountFly(){
        for(Animal animal : animals){
            if(animal.fly()){
                System.out.println(animal.getClass().getName()+" can fly");
                count++;
            }
        }
        assertSame(4,count);
    }
    @Test
    void testCountWalk(){
        for(Animal animal : animals){
            if(animal.walk()){
                System.out.println(animal.getClass().getName()+" can walk");
                count++;
            }
        }
        assertSame(6,count);
    }
    @Test
    void testCountSing(){
        for(Animal animal : animals){
            if(animal.sing()){
                System.out.println(animal.getClass().getName()+" can sing");
                count++;
            }
        }
        assertSame(6,count);
    }
    @Test
    void testCountSwim(){

        for(Animal animal : animals){
            if(animal.swim()){
                System.out.println(animal.getClass().getName()+" can swim");
                count++;
            }
        }
        assertSame(4,count);
    }
}

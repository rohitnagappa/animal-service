package org.nagappa.domain.models.fish;

import org.nagappa.domain.abs.Animal;
import org.nagappa.domain.abs.Fish;

public class Dolphin extends Animal {

    Fish fish;

    Dolphin(){

    }
    public Dolphin(Fish fish){
        this.fish = fish;
    }

    @Override
    public boolean fly() {
        return fish.fly();
    }

    @Override
    public boolean walk() {
        return fish.walk();
    }

    @Override
    public boolean sing() {
        return fish.sing();
    }

    @Override
    public boolean swim() {
        return fish.swim();
    }

}

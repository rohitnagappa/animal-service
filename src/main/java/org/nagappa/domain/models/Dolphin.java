package org.nagappa.domain.models;

import org.nagappa.domain.ifc.Animal;
import org.nagappa.domain.ifc.Fish;

public class Dolphin implements Animal {

    Fish fish;

    Dolphin(){

    }
    Dolphin(Fish fish){
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

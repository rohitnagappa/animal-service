package org.nagappa.domain.models;

import org.nagappa.domain.ifc.Animal;

public class Rooster implements Animal {
    Animal rooster = new Chicken();

    @Override
    public boolean sing(){
        System.out.println("As i am rooster, so i am singing Cock-a-doodle-doo...");
        return true;
    }

    @Override
    public boolean swim(){
        return rooster.swim();
    }

    @Override
    public boolean fly(){
        return rooster.fly();
    }

    @Override
    public boolean walk(){
        return rooster.walk();
    }

}

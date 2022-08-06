package org.nagappa.domain.models.birds;

import org.nagappa.domain.abs.Animal;

public class Bird extends Animal{

    @Override
    public boolean fly() {
        System.out.println("i am flying...");
        return true;
    }

    @Override
    public boolean walk() {
        System.out.println("i am walking...");
        return true;
    }

    @Override
    public boolean sing() {
        System.out.println("i am singing...");
        return true;
    }

    @Override
    public boolean swim() {
        System.out.println("i cannot swim.");
        return false;
    }

}

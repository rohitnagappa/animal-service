package org.nagappa.domain.models.pets;

import org.nagappa.domain.abs.Animal;

public class Dog extends Animal {
    @Override
    public boolean fly() {
        System.out.println("As i am dog, so i cannot fly.");
        return false;
    }

    @Override
    public boolean walk() {
        System.out.println("as i am dog, so i am walking...");
        return true;
    }

    @Override
    public boolean sing() {
        System.out.println("Woof, woof");
        return true;
    }

    @Override
    public boolean swim() {
        System.out.println("as i am dog, so i am swimming...");
        return true;
    }
}

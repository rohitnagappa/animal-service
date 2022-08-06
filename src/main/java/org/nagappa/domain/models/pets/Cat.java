package org.nagappa.domain.models.pets;

import org.nagappa.domain.abs.Animal;

public class Cat extends Animal {
    @Override
    public boolean fly() {
        System.out.println("As i am cat, so i cannot fly");
        return false;
    }

    @Override
    public boolean walk() {
        System.out.println("As i am cat, I'm walking...");
        return true;
    }

    @Override
    public boolean sing() {
        System.out.println("Me ow");
        return true;
    }

    @Override
    public boolean swim() {
        System.out.println("As i am cat, so i am swimming...");
        return true;
    }
}

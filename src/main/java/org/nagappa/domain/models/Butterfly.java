package org.nagappa.domain.models;

import org.nagappa.domain.ifc.Animal;

public class Butterfly implements Animal {
    @Override
    public boolean fly() {
        System.out.println("As i am butterfly, i can fly");
        return true;
    }

    @Override
    public boolean walk() {
        System.out.println("As i am butterfly, i cannot walk");
        return false;
    }

    @Override
    public boolean sing() {
        System.out.println("As i am butterfly, i cannot sing");
        return false;
    }

    @Override
    public boolean swim() {
        System.out.println("As i am butterfly, i cannot swim.");
        return false;
    }
}

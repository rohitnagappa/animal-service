package org.nagappa.domain.models;

import org.nagappa.domain.ifc.Animal;

public class Bird implements Animal {

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
}

package org.nagappa.domain.models.birds;

public class Duck extends Bird {

    @Override
    public boolean sing() {
        System.out.println("Quack! Quack!...");
        return true;
    }

    @Override
    public boolean swim() {
        System.out.println("As i am duck , so i'm swimming...");
        return true;
    }
}

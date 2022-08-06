package org.nagappa.domain.models.birds;

public class Chicken extends Bird {

    @Override
    public boolean sing() {
        System.out.println("Cluck! Cluck!...");
        return true;
    }

    @Override
    public boolean fly() {
        System.out.println("As i am chicken, so i cannot fly.");
        return false;
    }

}

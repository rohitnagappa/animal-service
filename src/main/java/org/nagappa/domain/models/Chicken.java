package org.nagappa.domain.models;

public class Chicken extends Bird{

    @Override
    public boolean sing() {
        System.out.println("As i am chicken, so i am singing Cluck! Cluck!...");
        return true;
    }

    @Override
    public boolean fly() {
        System.out.println("As i am chicken, so i cannot fly.");
        return false;
    }

}

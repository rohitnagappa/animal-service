package org.nagappa.domain.models.fish;

import org.nagappa.domain.abs.Fish;

public class Shark extends Fish {
    private String size;
    private String color;

    public Shark(){
        this.size = "large";
        this.color = "grey";
    }

    @Override
    public boolean fly() {
        System.out.println("As i am shark, i cannot fly");
        return false;
    }

    @Override
    public boolean walk() {
        System.out.println("As i am shark, i cannot walk.");
        return false;
    }

    @Override
    public boolean sing() {
        System.out.println("As i am shark, i cannot sing.");
        return false;
    }

    @Override
    public boolean swim() {
        System.out.println("As i am shark, so i am swimming...");
        return true;
    }

    @Override
    public boolean eat() {
        System.out.println("As i am shark, so i am eating other fishes...");
        return true;
    }

    @Override
    public boolean makeJokes() {
        System.out.println("As i am shark, so i dont make jokes.");
        return false;
    }

    @Override
    public void size() {
        this.size = "large";
        System.out.println("As i am shark, so i am large.");
    }

    @Override
    public void color() {
        this.color = "grey";
        System.out.println("As i am shark, so i am grey.");
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}

package org.nagappa.domain.models;

import org.nagappa.domain.ifc.Fish;

public class ClownFish implements Fish {
    private String size;
    private String color;

    @Override
    public boolean fly() {
        System.out.println("As i am clownfish, so i cannot fly");
        return false;
    }

    @Override
    public boolean walk() {
        System.out.println("As i am clownfish, so i cannot walk");
        return false;
    }

    @Override
    public boolean sing() {
        System.out.println("As i am clownfish, so i cannot sing");
        return false;
    }

    @Override
    public boolean swim() {
        System.out.println("As i am clownfish, so i am swimming");
        return true;
    }

    @Override
    public boolean eat() {
        System.out.println("As i am clownfish, i dont eat other fishes.");
        return false;
    }

    @Override
    public boolean makeJokes() {
        System.out.println("As i am clownfish, so i make jokes.");
        return true;
    }

    @Override
    public void size() {
        this.size = "small";
        System.out.println("As i am clownfish, so my size is small.");
    }

    @Override
    public void color() {
        this.color = "orange";
        System.out.println("As i am clownfish, so my color is orange");
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}

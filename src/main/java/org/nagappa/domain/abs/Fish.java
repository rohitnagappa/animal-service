package org.nagappa.domain.abs;

public abstract class Fish extends Animal {

    protected boolean canEat;
    protected boolean canMakeJokes;
    protected String size;
    protected String color;

    public boolean isCanEat() {
        return this.eat();
    }

    public boolean isCanMakeJokes() {
        return this.makeJokes();
    }

    public String getSize() {
        return this.size;
    }

    public String getColor() {
        return this.color;
    }

    public abstract boolean eat();
    public abstract boolean makeJokes();
    public abstract void size();
    public abstract void color();
}

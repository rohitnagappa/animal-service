package org.nagappa.domain.abs;

import java.io.Serializable;

public abstract class Animal implements Serializable {

    static final long serialVersionUID = -6470090944414208496L;

    protected boolean canWalk;
    protected boolean canSwim;
    protected boolean canSing;
    protected boolean canFly;
    protected String name;

    public boolean isCanWalk() {
        return this.walk();
    }

    public boolean isCanSwim() {
        return this.swim();
    }

    public boolean isCanSing() {
        return this.sing();
    }

    public boolean isCanFly() {
        return this.fly();
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
    public abstract boolean fly();
    public abstract boolean walk();
    public abstract boolean sing();
    public abstract boolean swim();
}

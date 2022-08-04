package org.nagappa.domain.models;

import org.nagappa.domain.ifc.Animal;

public class Butterfly implements Animal {

    private boolean isCatP;

    Butterfly(){
    }
    Butterfly(boolean isCatP){
        this.isCatP = isCatP;
    }

    @Override
    public boolean fly() {
        if(isCatP){
            System.out.println("As i am catterpillar, i cannot fly");
        }else {
            System.out.println("As i am butterfly, i can fly");
        }
        return !isCatP;
    }

    @Override
    public boolean walk() {
        if(isCatP){
            System.out.println("As i am catterpillar, i can walk/crawl");
        }else {
            System.out.println("As i am butterfly, i cannot walk");
        }
        return isCatP;
    }

    @Override
    public boolean sing() {
        System.out.println("i cannot sing");
        return false;
    }

    @Override
    public boolean swim() {
        System.out.println("i cannot swim.");
        return false;
    }

    public boolean isCatP() {
        return isCatP;
    }

    public void setCatP(boolean catP) {
        isCatP = catP;
    }
}

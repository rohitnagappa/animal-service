package org.nagappa.domain.models;

import org.nagappa.domain.abs.Animal;

public class Butterfly extends Animal {

    private boolean isCaterpillar;

    public Butterfly(){
    }
    Butterfly(boolean isCatP){
        this.isCaterpillar = isCatP;
    }

    @Override
    public boolean fly() {
        if(isCaterpillar){
            System.out.println("As i am catterpillar, i cannot fly");
        }else {
            System.out.println("As i am butterfly, i can fly");
        }
        return !isCaterpillar;
    }

    @Override
    public boolean walk() {
        if(isCaterpillar){
            System.out.println("As i am catterpillar, i can walk/crawl");
        }else {
            System.out.println("As i am butterfly, i cannot walk");
        }
        return isCaterpillar;
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

    public boolean isCaterpillar() {
        return isCaterpillar;
    }

    public void setCaterpillar(boolean catP) {
        isCaterpillar = catP;
    }
}

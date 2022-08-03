package org.nagappa.domain.models;

import org.nagappa.domain.ifc.Animal;

public class Parrot extends Bird {

    private Animal animalLivesWith;

    Parrot(){
    }

    Parrot(Animal animalLivesWith){
        this.animalLivesWith = animalLivesWith;
    }

    public void setAnimalLivesWith(Animal animalLivesWith) {
        this.animalLivesWith = animalLivesWith;
    }

    public Animal getAnimalLivesWith() {
        return animalLivesWith;
    }

    @Override
    public boolean sing() {
        if(animalLivesWith == null){
            System.out.println("As i'm living alone, i say Pee Paa...");
        }else{
            System.out.println(animalLivesWith.sing());
        }
        return true;
    }
}

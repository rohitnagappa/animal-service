package org.nagappa.services;

import io.github.resilience4j.retry.annotation.Retry;
import org.nagappa.domain.abs.Animal;
import org.nagappa.domain.models.Butterfly;
import org.nagappa.domain.models.birds.*;
import org.nagappa.domain.models.fish.ClownFish;
import org.nagappa.domain.models.fish.Shark;
import org.nagappa.domain.models.pets.Cat;
import org.nagappa.domain.models.pets.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    public List<String> getListAnimals(){
        List<String> animals = new ArrayList<>();
        animals.add("Bird");
        animals.add("Duck");
        animals.add("Chicken");
        animals.add("Rooster");
        animals.add("Parrot");
        animals.add("ClownFish");
        animals.add("Dolphin");
        animals.add("Shark");
        animals.add("Cat");
        animals.add("Dog");
        return  animals;
    }

    public  Animal getAnimal(String animal){
        Animal res ;
        switch (animal) {
            case "chicken" :
                res = new Chicken();
                break;
            case "bird" :
                res = new Bird();
                break;
            case "duck" :
                res = new Duck();
                break;
            case "rooster" :
                res = new Rooster();
                break;
            case "parrot" :
                res = new Parrot(new Cat());
                break;
            case "clownfish" :
                res = new ClownFish();
                break;
            case "shark" :
                res = new Shark();
                break;
            case "cat" :
                res = new Cat();
                break;
            case "butterfly" :
                res = new Butterfly();
                break;
            default:
                res = new Dog();
        }
        return res;
    }
}

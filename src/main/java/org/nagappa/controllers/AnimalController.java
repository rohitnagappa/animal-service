package org.nagappa.controllers;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import io.micrometer.core.annotation.Timed;
import org.nagappa.domain.abs.Animal;
import org.nagappa.services.AnimalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController  {
    private static final Logger logger = LoggerFactory.getLogger(AnimalController.class);
    @Autowired
    private AnimalService animalService;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public List<String> getListAnimals(){
        logger.info("get animal list called");
        return animalService.getListAnimals();
    }

    @RequestMapping(value = "/my/{animal}", method = RequestMethod.GET)
    public Animal getAnimal(@PathVariable("animal") String animal){
        logger.info("get particular animal called");
        return animalService.getAnimal(animal);
    }
}

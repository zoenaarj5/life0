package org.kavus.life1.tst;

import org.kavus.life1.ntt.Animal;
import org.kavus.life1.ntt.AnimalFactory;
import org.kavus.life1.ntt.CatFactory;
import org.kavus.life1.ntt.DogFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Life1Tester {
    public static void main(String[] args){
        AnimalFactory
            catFac=CatFactory.getUniqueInstance(),
            dogFac= DogFactory.getUniqueInstance();
        List<Animal> animalList=new ArrayList<>();
        animalList.add(catFac.getAnimalInstance(LocalDate.of(2018,7,17),"Félix"));
        animalList.add(dogFac.getAnimalInstance(LocalDate.of(2014,12,13),"Snoopy"));
        animalList.add(catFac.getAnimalInstance(LocalDate.of(2012,11,4),"Garfield"));
        animalList.add(dogFac.getAnimalInstance(LocalDate.of(2009,12,30),"Ran Tan Plan"));
        System.out.println("PRINTING ANIMALS");
        animalList.forEach(animal -> System.out.println(animal));
        System.out.println("DONE PRINTING ANIMALS");
    }
}

package org.kavus.life2.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.kavus.life1.ntt.*;

@WebService
public class LifeService {
    final AnimalFactory
            catFac= CatFactory.getUniqueInstance(),
            dogFac= DogFactory.getUniqueInstance();
    final List<Animal> animalList=new ArrayList<>();
    @WebMethod
    public String getRemainingLife(String petName){
        animalList.add(catFac.getAnimalInstance(LocalDate.of(2018,7,17),"Félix"));
        animalList.add(dogFac.getAnimalInstance(LocalDate.of(2014,12,13),"Snoopy"));
        animalList.add(catFac.getAnimalInstance(LocalDate.of(2012,11,4),"Garfield"));
        animalList.add(dogFac.getAnimalInstance(LocalDate.of(2009,12,30),"Ran Tan Plan"));
        System.out.println("PRINTING ANIMALS");
        animalList.forEach(animal -> System.out.println(animal));
        System.out.println("DONE PRINTING ANIMALS");
        Object[] oPetList=animalList.stream().filter(animal -> animal.getName().toUpperCase().equals(petName)).toArray();
        if(oPetList.length==0){
            return "NOTHING FOUND";
        }else{
            Animal res=(Animal)(oPetList[0]);
            StringBuilder sb=new StringBuilder();
            sb.append(res.getName());
            sb.append("\tis born on\t");
            sb.append(res.getBirthDate());
            return sb.toString();
        }
    }
}

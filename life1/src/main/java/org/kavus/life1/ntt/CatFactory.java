package org.kavus.life1.ntt;

import java.time.LocalDate;

public class CatFactory extends AnimalFactory {
    private static CatFactory uniqueInstance=new CatFactory();

    public static CatFactory getUniqueInstance() {
        return uniqueInstance;
    }

    private CatFactory() {
    }

    public static void setUniqueInstance(CatFactory uniqueInstance) {
        CatFactory.uniqueInstance = uniqueInstance;
    }

    @Override
    public Animal getAnimalInstance() {
        return new Cat();
    }

    @Override
    public Animal getAnimalInstance(LocalDate birthDate, String name) {
        return new Cat(birthDate,name);
    }
}

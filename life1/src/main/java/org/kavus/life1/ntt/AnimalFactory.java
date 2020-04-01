package org.kavus.life1.ntt;

import java.time.LocalDate;

public abstract class AnimalFactory {
    public abstract Animal getAnimalInstance();
    public abstract Animal getAnimalInstance(LocalDate birthDate, String name);
}

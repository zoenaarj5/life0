package org.kavus.life1.ntt;

import java.time.LocalDate;

public class Dog extends Animal {
    @Override
    public void initLifeExpectancy() {
        this.lifeExpectancy=14;
    }

    @Override
    public void initNoiseMaker() {
        this.noiseMaker=new Verb("bark","barking");
    }

    public Dog() {
    }

    public Dog(LocalDate birthDate, String name) {
        super(birthDate, name);
    }
}

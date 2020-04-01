package org.kavus.life1.ntt;

import java.time.LocalDate;

public class Cat extends Animal {
    @Override
    public void initLifeExpectancy() {
        this.lifeExpectancy=12;
    }

    @Override
    public void initNoiseMaker() {
        this.noiseMaker=new Verb("meow","meowing");
    }

    public Cat() {
        super();
    }

    public Cat(LocalDate birthDate, String name) {
        super(birthDate, name);
    }
}

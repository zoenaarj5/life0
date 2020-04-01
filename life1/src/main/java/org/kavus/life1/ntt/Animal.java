package org.kavus.life1.ntt;

import java.time.LocalDate;

public abstract class Animal {
    protected LocalDate birthDate;
    protected String name;
    protected Verb noiseMaker;
    protected int lifeExpectancy;
    public Animal(){
        super();
        initNoiseMaker();
        initLifeExpectancy();
    }

    public Animal(LocalDate birthDate, String name) {
        super();
        this.birthDate = birthDate;
        this.name = name;
        initNoiseMaker();
        initLifeExpectancy();
    }
    public abstract void initLifeExpectancy();

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public abstract void initNoiseMaker();

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Verb getNoiseMaker() {
        return noiseMaker;
    }

    public void setNoiseMaker(Verb noiseMaker) {
        this.noiseMaker = noiseMaker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("\nNamed:\t");
        sb.append(this.name);
        sb.append("\tBorn on:\t");
        sb.append(this.birthDate);
        sb.append("\tNoise:\t");
        sb.append(this.noiseMaker);
        return sb.toString();
    }
}

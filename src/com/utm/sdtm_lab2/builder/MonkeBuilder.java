package com.utm.sdtm_lab2.builder;

import com.utm.sdtm_lab2.entity.Animal;

public class MonkeBuilder implements AnimalBuilder {

    private Animal monke;

    public MonkeBuilder() {
        monke = new Animal();
    }

    public void resetBuilder() {
        this.monke = null;
    }

    @Override
    public Animal getAnimal() {
        Animal animal = this.monke;
        resetBuilder();
        return animal;
    }

    @Override
    public void noteName() {
        monke.setName("Harambe");
    }

    @Override
    public void noteWeight() {
        monke.setWeight(69);
    }

    @Override
    public void noteHeight() {
        monke.setHeight(169);
    }

    @Override
    public void noteGender() {
        monke.setGender("alpha");
    }

    @Override
    public void noteWingSpan() {

    }
}

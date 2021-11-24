package com.utm.sdtm_lab2.builder;

import com.utm.sdtm_lab2.entity.Animal;

public class BirbBuilder implements AnimalBuilder {

    private final Animal birb;

    public BirbBuilder() {
        birb = new Animal();
    }

    @Override
    public Animal getAnimal() {
        return birb;
    }

    @Override
    public void noteName() {
        birb.setName("Kesha");
    }

    @Override
    public void noteWeight() {
        birb.setWeight(0.035f);
    }

    @Override
    public void noteHeight() {
        birb.setHeight(10); /* smol */
    }

    @Override
    public void noteGender() {
        birb.setGender("birb");
    }

    @Override
    public void noteWingSpan() {
        birb.setWingSpan(20);
    }
}

package com.utm.sdtm_lab2.entity;

import com.utm.sdtm_lab2.builder.AnimalBuilder;

public class ZooKeeper {
    private final AnimalBuilder animalBuilder;

    public ZooKeeper(AnimalBuilder animalBuilder) {
        this.animalBuilder = animalBuilder;
    }

    public Animal getAnimal() {
        return animalBuilder.getAnimal();
    }

    public void bringInMonke() {
        animalBuilder.noteName();
        animalBuilder.noteHeight();
        animalBuilder.noteWeight();
        animalBuilder.noteGender();
    }

    public void bringInBirb() {
        animalBuilder.noteName();
        animalBuilder.noteHeight();
        animalBuilder.noteWeight();
        animalBuilder.noteGender();
        animalBuilder.noteWingSpan();
    }
}

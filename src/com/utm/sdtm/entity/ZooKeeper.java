package com.utm.sdtm.entity;

import com.utm.sdtm.builder.AnimalBuilder;

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

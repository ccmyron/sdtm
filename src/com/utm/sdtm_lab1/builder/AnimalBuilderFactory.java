package com.utm.sdtm_lab1.builder;

import com.utm.sdtm_lab1.entity.AnimalType;

public class AnimalBuilderFactory {
    public static AnimalBuilder generateAnimalBuilder(AnimalType animalType) {
        switch (animalType) {
            case MONKE:
                return new MonkeBuilder();
            case BIRB:
                return new BirbBuilder();
            default:
                throw new IllegalArgumentException("shiet");
        }
    }
}

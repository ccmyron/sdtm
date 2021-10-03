package com.utm.sdtm.builder;

import com.utm.sdtm.entity.AnimalType;

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

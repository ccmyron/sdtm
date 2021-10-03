package com.utm.sdtm.builder;

import com.utm.sdtm.entity.Animal;

public interface AnimalBuilder {
    void noteName();
    void noteWeight();
    void noteHeight();
    void noteGender();
    void noteWingSpan();
    Animal getAnimal();
}

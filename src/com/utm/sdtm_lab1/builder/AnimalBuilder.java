package com.utm.sdtm_lab1.builder;

import com.utm.sdtm_lab1.entity.Animal;

public interface AnimalBuilder {
    void noteName();
    void noteWeight();
    void noteHeight();
    void noteGender();
    void noteWingSpan();
    Animal getAnimal();
}

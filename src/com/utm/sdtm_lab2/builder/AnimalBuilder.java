package com.utm.sdtm_lab2.builder;

import com.utm.sdtm_lab2.entity.Animal;

public interface AnimalBuilder {
    void noteName();
    void noteWeight();
    void noteHeight();
    void noteGender();
    void noteWingSpan();
    Animal getAnimal();
}

package com.utm.sdtm_lab2.adapter;

import com.utm.sdtm_lab2.entity.Animal;

public class VaccinatedAnimalAdapter extends Animal {
    private VaccinatedAnimal vaccinatedAnimal;

    public VaccinatedAnimalAdapter(VaccinatedAnimal vaccinatedAnimal) {
        this.vaccinatedAnimal = vaccinatedAnimal;
    }

    public boolean isVaccinated() {
        return vaccinatedAnimal.isVaccinated();
    }
}

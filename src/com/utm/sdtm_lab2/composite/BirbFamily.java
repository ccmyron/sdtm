package com.utm.sdtm_lab2.composite;

import com.utm.sdtm_lab2.entity.Animal;

import java.util.List;

public class BirbFamily extends AnimalFamily{

    @Override
    public void add(Animal component) {
        super.add(component);
    }

    @Override
    public void add(Animal... components) {
        super.add(components);
    }

    @Override
    public List<Animal> getFamilyMembers() {
        return super.getFamilyMembers();
    }

    @Override
    public void remove(Animal child) {
        super.remove(child);
    }

    @Override
    public void remove(Animal... components) {
        super.remove(components);
    }

    @Override
    public void clear() {
        super.clear();
    }
}

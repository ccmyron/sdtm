package com.utm.sdtm_lab2.composite;

import com.utm.sdtm_lab2.entity.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalFamily extends Animal {

    protected List<Animal> familyMembers = new ArrayList<>();

    public void add(Animal component) {
        familyMembers.add(component);
    }

    public void add(Animal... components) {
        familyMembers.addAll(Arrays.asList(components));
    }

    public List<Animal> getFamilyMembers() {
        return familyMembers;
    }

    public void remove(Animal child) {
        familyMembers.remove(child);
    }

    public void remove(Animal... components) {
        familyMembers.removeAll(Arrays.asList(components));
    }

    public void clear() {
        familyMembers.clear();
    }

}

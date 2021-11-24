package com.utm.sdtm_lab2.composite;

import com.utm.sdtm_lab2.entity.Animal;

public class MonkeFamily extends AnimalFamily {
    @Override
    public void add(Animal component) {
        super.add(component);
    }

    @Override
    public void add(Animal... components) {
        super.add(components);
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

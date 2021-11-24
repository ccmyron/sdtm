package com.utm.sdtm_lab2.entity;

import com.utm.sdtm_lab2.builder.AnimalBuilder;
import com.utm.sdtm_lab2.builder.AnimalBuilderFactory;
import com.utm.sdtm_lab2.composite.AnimalFamily;
import com.utm.sdtm_lab2.composite.MonkeFamily;

public class ZooManager {

    private static ZooManager instance = null;

    private ZooManager() {}

    public static ZooManager getInstance() {
        if (instance == null) {
            instance = new ZooManager();
        }

        return instance;
    }


    public void openZoo() {
        AnimalFamily monkeFamily = new MonkeFamily();

        for (int i = 0; i < 5; i++) {
            AnimalBuilder animalBuilder = AnimalBuilderFactory.generateAnimalBuilder(AnimalType.MONKE);
            ZooKeeper zooKeeper = new ZooKeeper(animalBuilder);
            zooKeeper.bringInMonke();
            monkeFamily.add(zooKeeper.getAnimal());
        }

        System.out.println(monkeFamily.getFamilyMembers());

        AnimalFamily birbFamily = new MonkeFamily();

        for (int i = 0; i < 5; i++) {
            AnimalBuilder animalBuilder = AnimalBuilderFactory.generateAnimalBuilder(AnimalType.BIRB);
            ZooKeeper zooKeeper = new ZooKeeper(animalBuilder);
            zooKeeper.bringInBirb();
            birbFamily.add(zooKeeper.getAnimal());
        }

        System.out.println(birbFamily.getFamilyMembers());
    }
}

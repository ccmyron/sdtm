package com.utm.sdtm_lab1.entity;

import com.utm.sdtm_lab1.builder.AnimalBuilder;
import com.utm.sdtm_lab1.builder.AnimalBuilderFactory;

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
        AnimalBuilder animalBuilder = AnimalBuilderFactory.generateAnimalBuilder(AnimalType.MONKE);
        ZooKeeper zooKeeper = new ZooKeeper(animalBuilder);
        zooKeeper.bringInMonke();
        Animal monke = zooKeeper.getAnimal();

        System.out.println(monke.toString());

        animalBuilder = AnimalBuilderFactory.generateAnimalBuilder(AnimalType.BIRB);
        zooKeeper = new ZooKeeper(animalBuilder);
        zooKeeper.bringInBirb();
        Animal birb = zooKeeper.getAnimal();

        System.out.println(birb.toString());
    }
}

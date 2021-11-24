package com.utm.sdtm_lab2.adapter;

public class VaccinatedAnimal {
    private String name;
    private double weight;
    private double height;
    private String gender;
    private double wingSpan;
    private boolean isVaccinated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "VaccinatedAnimal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                ", wingSpan=" + wingSpan +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Eater, Botanist, Rider {
    private Farm farm;

    public Farmer() {

    }

    public void feed(Animal animal, Edible food, int amt) {

    }

    public void collect(Edible edible) {
        Silo.getGlobal().putInSilo(edible);
    }

    public Integer sell(Edible edible, int num){
        return Silo.getGlobal().removeFrom(edible,num);
    }

    @Override
    public void ride(Rideable R) {

    }

    @Override
    public void plantCrop(Crop crop, CropRow row) {
        row.add(crop);
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Eater, Botanist, Rider {
    private Farm farm;

    public Farmer() {

    }

    public void feed(Animal animal, Edible food) {
        feed(animal, food, 1);
    }

    public void feed(Animal animal, Edible food, int amt) {

    }

    public void collect(Edible crop) {
        Silo.increment(crop.toString());
    }

    public Integer sell(String crop, int num){
        return Silo.removeFrom(crop,num);
    }

    @Override
    public void mount(Rideable thing) {

    }

    @Override
    public void dismount(Rideable thing) {

    }

    @Override
    public void ride(Rideable R) {

    }



    @Override
    public void plantCrop(Crop crop, CropRow row) {

    }

    @Override
    public void eatFood(Edible food) {

    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}

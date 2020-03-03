package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Eater, Botanist, Rider {
    private Farm farm;

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    public void feed(Animal animal, Edible food) {
        feed(animal, food, 1);
    }

    public void feed(Animal animal, Edible food, int amt) {

    }

    @Override
    public void mount(Rideable thing) {

    }

    @Override
    public void dismount(Rideable thing) {

    }

    @Override
    public void ride(Horse h) {

    }

    @Override
    public void plantCrop(Crop crop, CropRow row) {

    }

    @Override
    public void eatFood(Edible food) {

    }
}

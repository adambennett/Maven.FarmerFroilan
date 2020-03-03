package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

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
    public void ride(Horse h) {

    }
}

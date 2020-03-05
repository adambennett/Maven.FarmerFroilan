package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.crops.Produce;
import com.zipcodewilmington.froilansfarm.crops.edibles.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Chicken extends Produce implements Animal {

    public Chicken() {
        super("Chicken", new Egg());
    }

    @Override
    public Edible yield() {
        return isFertilized() ? null : getEdible().clone();
    }

    @Override
    public String makeNoise() {
        return "Bock bock bock";
    }
}

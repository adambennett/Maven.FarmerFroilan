package com.zipcodewilmington.froilansfarm;

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
}

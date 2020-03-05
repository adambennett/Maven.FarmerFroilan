package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Crop extends Produce {

    public Crop(String name, Edible toYield) {
        super(name, toYield);
    }
}

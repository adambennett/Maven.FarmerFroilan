package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Egg implements Edible {

    @Override
    public Edible clone() {
        return new Egg();
    }

    @Override
    public String toString() {
        return "Egg";
    }
}

package com.zipcodewilmington.froilansfarm.crops.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class EarCorn implements Edible {
    @Override
    public Edible clone() {
        return new EarCorn();
    }

    @Override
    public String toString() {
        return "EarCorn";
    }
}

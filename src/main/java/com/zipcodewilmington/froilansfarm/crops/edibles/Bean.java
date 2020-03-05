package com.zipcodewilmington.froilansfarm.crops.edibles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Bean implements Edible {

    @Override
    public Edible clone() {
        return new Bean();
    }

    @Override
    public String toString() {
        return "Bean";
    }
}

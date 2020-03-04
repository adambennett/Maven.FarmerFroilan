package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.Silo;

public interface Eater {

    default void eatFood(Edible food) {
        Silo.removeFrom(food.toString(), 1);
    }
}

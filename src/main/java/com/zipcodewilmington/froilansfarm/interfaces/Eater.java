package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.Silo;

public interface Eater {
    default void eatFood(Edible food) { Silo.getGlobal().removeFrom(food, 1); }
}

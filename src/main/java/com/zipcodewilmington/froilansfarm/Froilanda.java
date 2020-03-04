package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;

public class Froilanda extends Farmer implements Pilot, Eater {
    private CropDuster cropDuster;


    @Override
    public void eatFood(Edible food) {
        Silo.removeFrom(food.toString(), 1);
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public void setCropDuster(CropDuster cropDuster) {
        this.cropDuster = cropDuster;
    }
}

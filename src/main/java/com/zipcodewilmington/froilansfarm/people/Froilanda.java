package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.farm.CropDuster;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;

public class Froilanda extends Farmer implements Pilot, Eater {
    private CropDuster cropDuster;

    public Froilanda() {
        cropDuster = new CropDuster();
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public void setCropDuster(CropDuster cropDuster) {
        this.cropDuster = cropDuster;
    }
}

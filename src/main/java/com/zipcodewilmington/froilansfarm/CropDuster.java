package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster implements FarmVehicle, Aircraft {

    public void fertilize(CropRow newCropRow){
        for(Crop c : newCropRow.getNewCrop()){
            c.setHasBeenFertilized(true);
        }

    }


    @Override
    public void fly() {

    }

    @Override
    public void operate(Farm farm) {

    }
}

package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster implements FarmVehicle, Aircraft {

    public void fertilize(CropRow newCropRow){
        for(Crop c : newCropRow.getCrops()){
            c.setFertilized(true);
        }

    }

    @Override
    public void fly(Field field) {
        for (CropRow row : field.getCropRows()) {
            fertilize(row);
        }
    }

    @Override
    public String makeNoise() {
        return "Skyvroom!";
    }
}

package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor implements FarmVehicle {

    public void harvest(Crop crop) {
        crop.setHarvested(true);
        Silo.getGlobal().putInSilo(crop.yield());
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }
}

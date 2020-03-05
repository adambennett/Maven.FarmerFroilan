package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

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

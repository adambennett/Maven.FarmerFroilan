package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

public class Tractor implements Vehicle, FarmVehicle, Rideable {

    public void harvest(Crop crop) {
        crop.setHarvested(true);
        Silo.getGlobal().putInSilo(crop.yield());
    }
}

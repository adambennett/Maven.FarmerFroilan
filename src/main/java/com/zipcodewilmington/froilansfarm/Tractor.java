package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

public class Tractor implements Vehicle, FarmVehicle, Rideable {

    public void harvest(Crop crop) {
        crop.setHasBeenHarvested(true);
        Silo.harvestAndAdd(crop);
    }

    @Override
    public void operate(Farm farm) {

    }


}

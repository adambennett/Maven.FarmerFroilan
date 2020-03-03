package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

public class Tractor implements Vehicle, FarmVehicle {

    public Edible harvest(Crop crop) {
        return null;
    }

    @Override
    public void operate(Farm farm) {

    }
}

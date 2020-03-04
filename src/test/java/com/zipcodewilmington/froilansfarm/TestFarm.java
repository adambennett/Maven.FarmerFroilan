package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestFarm {
    @Test
    public void testFarmChickenCoop() {
        Farm newFarm = new Farm();
        ArrayList<ChickenCoop> coop1 = new ArrayList<>();
        newFarm.setChickenCoops(coop1);

        Assert.assertEquals(coop1, newFarm.getChickenCoops());
    }

    @Test
    public void testFarmField() {
        Farm newFarm = new Farm();
        Field field1 = new Field();

        newFarm.setField(field1);

        Assert.assertEquals(field1, newFarm.getField());
    }

    @Test
    public void testFarmhouse() {
        Farm newFarm = new Farm();
        Farmhouse newFarmhouse = new Farmhouse();

        newFarm.setHouse(newFarmhouse);

        Assert.assertEquals(newFarmhouse, newFarm.getHouse());
    }

    @Test
    public void testFarmStables() {
        Farm newFarm = new Farm();
        ArrayList<Stable> stable1 = new ArrayList<>();
        newFarm.setStabs(stable1);

        Assert.assertEquals(stable1, newFarm.getStabs());
    }

    @Test
    public void testFarmVehicles() {
        Farm newFarm = new Farm();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        newFarm.setVehics(vehicles);

        Assert.assertEquals(vehicles, newFarm.getVehics());
    }
}

package com.zipcodewilmington.froilansfarm.froilan;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;

public class WeeklyTest
{
    private static Farm farm;
    private static Froilan froilan;

    @Before
    public void setup() {
        farm = new Farm();
        froilan = new Froilan();
        Field field = new Field();
        farm.setField(field);
        froilan.setFarm(farm);
        for (int i=0; i<5; i++){
            CropRow row = new CropRow();
            farm.getField().getCropRow().add(row);
        }

        // Feeding and riding all horses
        for (Stable s : froilan.getFarm().getStabs()) {
            for (Horse h : s.getHorseys()) {
                froilan.ride(h);
                froilan.feed(h, new EarCorn(), 3);
            }
        }

        // Breakfast routine
        froilan.eatFood(new EarCorn());
        froilan.eatFood(new Tomato());
        froilan.eatFood(new Tomato());
        froilan.eatFood(new Egg());
        froilan.eatFood(new Egg());
        froilan.eatFood(new Egg());
        froilan.eatFood(new Egg());
        froilan.eatFood(new Egg());
    }

    @Test
    public void SundayTest() {
        CropRow row1 = new CropRow();
        CropRow row2 = new CropRow();
        CropRow row3 = new CropRow();
        CropRow row4 = new CropRow();
        CropRow row5 = new CropRow();
        CornStalk cornstalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
        TomatoPlant tomatoPlantB = new TomatoPlant();
        CornStalk cornstalkB= new CornStalk();
        BeanStalk beanStalk = new BeanStalk();
        froilan.plantCrop(cornstalk, row1);
        froilan.plantCrop(tomatoPlant, row2);
        froilan.plantCrop(beanStalk, row3);
        froilan.plantCrop(tomatoPlantB, row4);
        froilan.plantCrop(cornstalkB, row5);
        for (Crop c : row1.getNewCrop()) {
            Assert.assertTrue(c.toString().equals(cornstalk.toString()));
        }

        for (Crop c : row2.getNewCrop()) {
            Assert.assertTrue(c.toString().equals(tomatoPlant.toString()));
        }

        for (Crop c : row3.getNewCrop()) {
            Assert.assertTrue(c.toString().equals(beanStalk.toString()));
        }

        for (Crop c : row4.getNewCrop()) {
            Assert.assertTrue(c.toString().equals(tomatoPlantB.toString()));
        }

        for (Crop c : row5.getNewCrop()) {
            Assert.assertTrue(c.toString().equals(cornstalkB.toString()));
        }
    }

    @Test
    public void TuesdayTest() {
            Tractor tractor = new Tractor();
            froilan.ride(tractor);
            int expected = 129;
            for (CropRow cropRow : farm.getField().getCropRow()) {

                for (Crop o : cropRow.getNewCrop()) {
                    tractor.harvest(o);
                    expected++;
                }
            }

            int actual = Silo.getNum();
            Silo.getSilo().clear();
            Assert.assertEquals(expected, actual);

    }

    @Test
    public void ThursdayTest() {
        // Fake harvest
        Silo.harvestAndAdd(new CornStalk());
        Silo.harvestAndAdd(new BeanStalk());
        froilan = new Froilan();
        Horse basketball = new Horse("Basketball");
        froilan.ride(basketball);
        String toSell = Silo.mostAbundant();
        Logger.getGlobal().info(toSell);
        Integer expected = 2;
        Integer actual = froilan.sell(toSell,2);
        froilan.ride(basketball);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void FridayTest() {
        froilan = new Froilan();
        Farm farm = new Farm();
        froilan.setFarm(farm);
        Integer expected = 129;
        for(ChickenCoop cc : farm.getChickenCoops()){
            for(Chicken c : cc.getChickenCoop()){
                froilan.collect(new Egg());
                froilan.collect(new Egg());
            }
        }
        Integer actual = Silo.getNum();
        Assert.assertEquals(expected, actual);
    }
}



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
     froilan.plantCrop(new CornStalk(), row1);
     froilan.plantCrop(new TomatoPlant(), row2);
     froilan.plantCrop(new BeanStalk(), row3);
     froilan.plantCrop(new TomatoPlant(), row4);
     froilan.plantCrop(new CornStalk(), row5);
    }

    @Test
    public void TuesdayTest() {
            Tractor tractor = new Tractor();
            froilan.ride(tractor);
            int expected = 0;
            for (CropRow cropRow : farm.getField().getCropRow()) {

                for (Crop o : cropRow.getNewCrop()) {
                    tractor.harvest(o);
                    expected++;
                }
            }

            int actual = Silo.getNum();
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
    }



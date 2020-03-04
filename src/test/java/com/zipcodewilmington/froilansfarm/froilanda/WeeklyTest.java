package com.zipcodewilmington.froilansfarm.froilanda;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeeklyTest {

    private static Froilanda froilanda;
    private static Farm farm;

    @Before
    public void setup() {
        farm = new Farm();
        froilanda = new Froilanda();
        Field field = new Field();
        froilanda.setFarm(farm);
        farm.setField(field);
        for (int i=0; i<5; i++){
            CropRow row = new CropRow();
            farm.getField().getCropRow().add(row);
        }

        // Feeding and riding all horses
        for (Stable s : froilanda.getFarm().getStabs()) {
            for (Horse h : s.getHorseys()) {
                froilanda.ride(h);
                froilanda.feed(h, new EarCorn(), 3);
            }
        }

        // Breakfast routine
        froilanda.eatFood(new EarCorn());
        froilanda.eatFood(new EarCorn());
        froilanda.eatFood(new Tomato());
        froilanda.eatFood(new Egg());
        froilanda.eatFood(new Egg());

    }

    @Test
    public void testMonday() {
        CropDuster cropDuster = new CropDuster();
        froilanda.setCropDuster(cropDuster);
        froilanda.getCropDuster().fly();
        for (CropRow cropRow : farm.getField().getCropRow()) {
            froilanda.getCropDuster().fertilize(cropRow);
        }
//        for(CropRow cropRow : farm.getField().getCropRow()){
//            Assert.assertTrue(cropRow.);
//        }

    }

    @Test
    public void testWednesday() {
        froilanda = new Froilanda();
        Farm farm = new Farm();
        froilanda.setFarm(farm);
        for(ChickenCoop cc : farm.getChickenCoops()){
            for(Chicken c : cc.getChickenCoop()){
                froilanda.collect(new Egg());
                froilanda.collect(new Egg());
            }
        }
        Integer expected = 32;
        Integer actual = Silo.getNum();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSaturday(){
        froilanda = new Froilanda();
        froilanda.inspectCropDuster();
        Assert.assertTrue(froilanda.inspectCropDuster());
    }


}

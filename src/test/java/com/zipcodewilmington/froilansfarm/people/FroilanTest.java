package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.ChickenCoop;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.Stable;
import com.zipcodewilmington.froilansfarm.crops.BeanStalk;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.crops.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.edibles.Egg;
import com.zipcodewilmington.froilansfarm.crops.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.farm.*;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class FroilanTest
{
    private static Farm farm;
    private static Froilan froilan;
    private static Field field;

    @Before
    public void setup() {
        Silo.getGlobal().reset();
        farm = new Farm();
        froilan = new Froilan();
        field = new Field();
        farm.setField(field);
        froilan.setFarm(farm);

        for (int i=0; i<5; i++){
            CropRow row = new CropRow();
            farm.getField().getCropRows().add(row);
        }

        // Feeding and riding all horses
        for (Stable s : froilan.getFarm().getStabs()) {
            for (Horse h : s.getHorses()) {
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
    public void testImplementation() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Rider);
    }

    @Test
    public void testInheritance() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Farmer);
    }

    @Test
    public void SundayTest() {
        CropRow row1 = froilan.getFarm().getField().getCropRows().get(0);
        CropRow row2 = froilan.getFarm().getField().getCropRows().get(1);
        CropRow row3 = froilan.getFarm().getField().getCropRows().get(2);

        froilan.plantCrop(new CornStalk(), row1);
        froilan.plantCrop(new TomatoPlant(), row2);
        froilan.plantCrop(new BeanStalk(), row3);

        for (Crop c : row1.getCrops()) {
            Assert.assertTrue(c instanceof CornStalk);
        }

        for (Crop c : row2.getCrops()) {
            Assert.assertTrue(c instanceof TomatoPlant);
        }

        for (Crop c : row3.getCrops()) {
            Assert.assertTrue(c instanceof BeanStalk);
        }
    }

    @Test
    public void TuesdayTest() {
        // Fake redo Sunday planting
        CropRow row1 = froilan.getFarm().getField().getCropRows().get(0);
        CropRow row2 = froilan.getFarm().getField().getCropRows().get(1);
        CropRow row3 = froilan.getFarm().getField().getCropRows().get(2);
        froilan.plantCrop(new CornStalk(), row1);
        froilan.plantCrop(new TomatoPlant(), row2);
        froilan.plantCrop(new BeanStalk(), row3);
        // Fake redo Sunday planting

        Tractor tractor = new Tractor();
        froilan.ride(tractor);
        int expected = 3;
        int actual = 0;
        boolean harvestedCorn = false;
        boolean harvestedTomato = false;
        boolean harvestedBeans = false;
        for (CropRow cropRow : farm.getField().getCropRows()) {
            for (Crop o : cropRow.getCrops()) {
                if (o instanceof CornStalk) { harvestedCorn = true; }
                if (o instanceof TomatoPlant) { harvestedTomato = true; }
                if (o instanceof BeanStalk) { harvestedBeans = true; }
                tractor.harvest(o);
                actual++;
            }
        }
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(harvestedBeans);
        Assert.assertTrue(harvestedCorn);
        Assert.assertTrue(harvestedTomato);
    }

    @Test
    public void ThursdayTest() {
        // Fake harvest
        CornStalk corns = new CornStalk();
        BeanStalk beans = new BeanStalk();
        CropDuster duster = new CropDuster();
        CropRow row = new CropRow();
        Tractor tractor = new Tractor();
        row.add(corns);
        row.add(beans);
        duster.fertilize(row);
        tractor.harvest(corns);
        tractor.harvest(beans);
        Silo.getGlobal().putInSilo(corns.yield());
        Silo.getGlobal().putInSilo(beans.yield());
        // Fake harvest

        froilan = new Froilan();
        Horse basketball = new Horse();
        froilan.ride(basketball);
        Edible toSell = Silo.getGlobal().mostAbundant();
        Logger.getGlobal().info(toSell.toString());
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
        Integer expected = 120;
        for(ChickenCoop cc : farm.getChickenCoops()){
            for(Chicken c : cc.getChickenCoop()){
                froilan.collect(new Egg());
                froilan.collect(new Egg());
            }
        }
        Integer actual = Silo.getGlobal().getNum();
        Assert.assertEquals(expected, actual);
    }
}



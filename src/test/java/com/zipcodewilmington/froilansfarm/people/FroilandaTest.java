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
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FroilandaTest {

    private static Farm farm;
    private static Froilanda froilanda;
    private static Field field;

    @Before
    public void setup() {
        Silo.getGlobal().reset();
        farm = new Farm();
        froilanda = new Froilanda();
        field = new Field();
        farm.setField(field);
        froilanda.setFarm(farm);

        for (int i=0; i<5; i++){
            CropRow row = new CropRow();
            farm.getField().getCropRows().add(row);
        }

        // Feeding and riding all horses
        for (Stable s : froilanda.getFarm().getStabs()) {
            for (Horse h : s.getHorses()) {
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
    public void testInheritance() {
        Froilanda f = new Froilanda();
        Assert.assertTrue(f instanceof Farmer);
    }

    @Test
    public void testImplementation() {
        Froilanda f = new Froilanda();
        Assert.assertTrue(f instanceof Pilot);
    }

    @Test
    public void testImplementation2() {
        Froilanda f = new Froilanda();
        Assert.assertTrue(f instanceof Eater);
    }

    @Test
    public void testFroilanda() {
        Froilanda f = new Froilanda();
        CropDuster cropDuster = new CropDuster();

        f.setCropDuster(cropDuster);

        Assert.assertEquals(cropDuster, f.getCropDuster());
    }

    @Test
    public void MondayTest() {
        // Fake planting from sunday
        CropRow row1 = froilanda.getFarm().getField().getCropRows().get(0);
        CropRow row2 = froilanda.getFarm().getField().getCropRows().get(1);
        CropRow row3 = froilanda.getFarm().getField().getCropRows().get(2);
        froilanda.plantCrop(new CornStalk(), row1);
        froilanda.plantCrop(new TomatoPlant(), row2);
        froilanda.plantCrop(new BeanStalk(), row3);
        // Fake planting from sunday

        froilanda.getCropDuster().fly(field);
        for (CropRow row : field.getCropRows()) {
            for (Crop crop : row.getCrops()) {
                Assert.assertTrue(crop.isFertilized());
            }
        }
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
        froilanda.plantCrop(cornstalk, row1);
        froilanda.plantCrop(tomatoPlant, row2);
        froilanda.plantCrop(beanStalk, row3);
        froilanda.plantCrop(tomatoPlantB, row4);
        froilanda.plantCrop(cornstalkB, row5);
        for (Crop c : row1.getCrops()) {
            Assert.assertTrue(c.toString().equals(cornstalk.toString()));
        }

        for (Crop c : row2.getCrops()) {
            Assert.assertTrue(c.toString().equals(tomatoPlant.toString()));
        }

        for (Crop c : row3.getCrops()) {
            Assert.assertTrue(c.toString().equals(beanStalk.toString()));
        }

        for (Crop c : row4.getCrops()) {
            Assert.assertTrue(c.toString().equals(tomatoPlantB.toString()));
        }

        for (Crop c : row5.getCrops()) {
            Assert.assertTrue(c.toString().equals(cornstalkB.toString()));
        }
    }

    @Test
    public void TuesdayTest() {
        Tractor tractor = new Tractor();
        froilanda.ride(tractor);
        int expected = 91;
        for (CropRow cropRow : farm.getField().getCropRows()) {

            for (Crop o : cropRow.getCrops()) {
                tractor.harvest(o);
                expected++;
            }
        }

        int actual = Silo.getGlobal().getNum();
        Silo.getGlobal().getSilo().clear();
        Assert.assertEquals(expected, actual);

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

        froilanda = new Froilanda();
        Horse basketball = new Horse();
        froilanda.ride(basketball);
        Edible toSell = Silo.getGlobal().mostAbundant();
        Integer expected = 2;
        Integer actual = froilanda.sell(toSell,2);
        froilanda.ride(basketball);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void FridayTest() {
        froilanda = new Froilanda();
        Farm farm = new Farm();
        froilanda.setFarm(farm);
        Integer expected = 123;
        for(ChickenCoop cc : farm.getChickenCoops()){
            for(Chicken c : cc.getChickenCoop()){
                froilanda.collect(new Egg());
                froilanda.collect(new Egg());
            }
        }
        Integer actual = Silo.getGlobal().getNum();
        Assert.assertEquals(expected, actual);
    }

}

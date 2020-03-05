package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.farm.Tractor;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTractor {

    Tractor tractor;
    Silo silo;
    Crop crop;

    @Before
    public void setup(){
        this.tractor = new Tractor();
        this.silo = Silo.getGlobal();
        this.crop = new TomatoPlant();
    }

    @Test
    public void testImplementation(){

        boolean actual = tractor instanceof Vehicle;
        boolean actual1 = tractor instanceof FarmVehicle;
        boolean actual2 = tractor instanceof Rideable;

        Assert.assertTrue(actual);
        Assert.assertTrue(actual1);
        Assert.assertTrue(actual2);

    }

    @Test
    public void testHarvest(){
        // Given
        tractor.harvest(crop);
        Integer expected = 77;

        // When
        Integer actual = silo.getNum();

        // Then
        Assert.assertEquals(expected, actual);
    }


}

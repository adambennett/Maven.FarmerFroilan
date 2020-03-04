package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Track;
import java.util.HashMap;
import java.util.Map;

public class TestTractor {

    Tractor tractor;
    Silo silo;
    Crop crop;

    @Before
    public void setup(){
        this.tractor = new Tractor();
        this.silo = new Silo();
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
        Integer expected = 1;

        // When
        Integer actual = silo.getSilo().size();

        // Then
        Assert.assertEquals(expected, actual);
    }


}

package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TestTomatoPlant {

    @Test
    public void testImplementation(){

        TomatoPlant plant = new TomatoPlant();
        boolean actual = plant instanceof Crop;
        Assert.assertTrue(actual);

    }
}

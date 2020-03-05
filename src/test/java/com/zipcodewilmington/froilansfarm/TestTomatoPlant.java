package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
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

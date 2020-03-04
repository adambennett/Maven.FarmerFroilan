package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;
import org.junit.Assert;
import org.junit.Test;

import java.util.PrimitiveIterator;

public class TestCrop {
    @Test
    public void testImplementation() {
        Crop crop = new Crop();
        Assert.assertTrue(crop instanceof Produce);
    }

    @Test
    public void testHasBeenHarvested() {
        Crop crop = new Crop();
        crop.setHasBeenHarvested(true);

        Boolean expected = true;
        Boolean actual = crop.isHasBeenHarvested();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasBeenFertilized() {
        Crop crop = new Crop();
        crop.setHasBeenFertilized(false);

        Boolean expected = false;
        Boolean actual = crop.isHasBeenFertilized();

        Assert.assertEquals(expected, actual);
    }
}

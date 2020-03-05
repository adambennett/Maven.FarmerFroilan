package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestCrop {
    @Test
    public void testImplementation() {
        Crop crop = new CornStalk();
        Assert.assertTrue(crop instanceof Produce);
    }

    @Test
    public void testHasBeenHarvested() {
        Crop crop = new BeanStalk();
        crop.setHarvested(true);

        Boolean expected = true;
        Boolean actual = crop.isHarvested();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasBeenFertilized() {
        Crop crop = new TomatoPlant();
        crop.setFertilized(false);

        Boolean expected = false;
        Boolean actual = crop.isFertilized();

        Assert.assertEquals(expected, actual);
    }
}

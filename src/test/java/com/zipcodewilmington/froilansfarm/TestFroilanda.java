package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class TestFroilanda {
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
}

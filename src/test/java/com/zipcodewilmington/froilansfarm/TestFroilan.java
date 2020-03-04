package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import org.junit.Assert;
import org.junit.Test;

public class TestFroilan {
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
}

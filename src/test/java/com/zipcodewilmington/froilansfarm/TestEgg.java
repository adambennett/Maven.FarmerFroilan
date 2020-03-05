package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestEgg {
    @Test
    public void testImplementation() {
        Egg newEgg = new Egg();
        Assert.assertTrue(newEgg instanceof Edible);
    }
}

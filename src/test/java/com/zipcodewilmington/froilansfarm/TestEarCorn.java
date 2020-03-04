package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestEarCorn {
    @Test
    public void testImplementation() {
        EarCorn newCorn = new EarCorn();
        Assert.assertTrue(newCorn instanceof Edible);
    }
}

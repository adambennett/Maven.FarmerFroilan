package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void yield() {
        Chicken chk = new Chicken();
        chk.setFertilized(true);
        Assert.assertNull(chk.yield());
        chk.setFertilized(false);
        Assert.assertTrue(chk.yield() instanceof Egg);
    }
}
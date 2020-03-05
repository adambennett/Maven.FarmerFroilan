package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestProduce {

    @Test
    public void yield() {

        Produce tomato = new TomatoPlant();
        Produce tomatoB = new TomatoPlant();
        Produce tomatoC = new TomatoPlant();
        tomato.setHarvested(true);
        tomatoB.setHarvested(true);
        tomatoC.setHarvested(false);

        tomato.setFertilized(true);
        tomatoB.setFertilized(false);
        tomatoC.setFertilized(true);

        Assert.assertNull(tomatoB.yield());
        Assert.assertNull(tomatoB.yield());
        Assert.assertTrue(tomato.yield() instanceof Tomato);
        Assert.assertTrue(tomato.yield().toString().equals(tomato.getEdible().toString()));
        Assert.assertTrue(tomato.yield().equals(tomato.getEdible()));
    }
}
package com.zipcodewilmington.froilansfarm.animals;


import com.zipcodewilmington.froilansfarm.crops.Produce;
import com.zipcodewilmington.froilansfarm.crops.edibles.Egg;
import org.junit.Assert;
import org.junit.Test;

public class TestChicken {

    @Test
    public void testImplementation() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }

    @Test
    public void yield() {
        Chicken chk = new Chicken();
        chk.setFertilized(true);
        Assert.assertNull(chk.yield());
        chk.setFertilized(false);
        Assert.assertTrue(chk.yield() instanceof Egg);
    }
}

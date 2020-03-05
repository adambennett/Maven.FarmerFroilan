package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestChicken {

    @Test
    public void testImplementation() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }
}

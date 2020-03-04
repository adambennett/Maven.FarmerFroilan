package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestTomato {

    @Test
    public void testImplementation(){

        Tomato tomato = new Tomato();
        boolean actual = tomato instanceof Edible;
        Assert.assertTrue(actual);

    }

}

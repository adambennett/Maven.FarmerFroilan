package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestSilo {
    Silo silo;
    @Test
    public void initialValueTest(){
        silo = Silo.getInstance();
        String actual = silo.printInventory();
        String expected = "Egg 49\nEarCorn 21\nTomato 21\nBean 5\n";
        Assert.assertEquals(expected,actual);
    }
}

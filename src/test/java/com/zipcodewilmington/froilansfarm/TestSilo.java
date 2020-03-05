package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;

public class TestSilo {
    Silo silo = Silo.getGlobal();
    @Test
    public void initialValueTest(){
        ArrayList<String> actual = silo.printInventory();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Egg 49");
        expected.add("EarCorn 21");
        expected.add("Tomato 21");
        expected.add("Bean 5");
        for (String s : actual) {
            Assert.assertTrue(expected.contains(s));
        }
    }

    @Test
    public void removeFrom() {
        EarCorn ear = new EarCorn();
        Tomato tomato = new Tomato();
        silo.putInSilo(ear, 1);
        silo.putInSilo(tomato, 1);
        silo.putInSilo(ear, 1);
        int expected = 23;
        int actual = silo.removeFrom(ear, 999);
        Assert.assertEquals(expected, actual);
    }
}

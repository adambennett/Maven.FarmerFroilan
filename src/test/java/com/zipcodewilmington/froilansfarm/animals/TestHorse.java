package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class TestHorse {
    @Test
    public void testInheritance() {
        Horse newHorse = new Horse();
        Assert.assertTrue(newHorse instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Horse newHorse = new Horse();
        Assert.assertTrue(newHorse instanceof Rideable);
    }
}

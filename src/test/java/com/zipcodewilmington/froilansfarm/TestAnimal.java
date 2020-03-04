package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestAnimal {

    @Test
    public void testAnimalName() {
        Animal animal = new Animal("Petey");

        String expected = "Petey";
        String actual = animal.getName();

        Assert.assertEquals(expected, actual);
    }
}

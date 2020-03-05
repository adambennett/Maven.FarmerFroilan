package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.CropDuster;
import com.zipcodewilmington.froilansfarm.farm.Tractor;
import com.zipcodewilmington.froilansfarm.people.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestNoiseMakers {

    @Test
    public void testNoises() {
        Person person = new Person();
        CropDuster cropDuster = new CropDuster();
        Chicken chicken = new Chicken();
        Tractor tractor = new Tractor();
        Horse horse = new Horse();
        String expectedPerson = "Hello!";
        String expectedDuster = "Skyvroom!";
        String expectedChicken = "Bock bock bock";
        String expectedTractor = "Vroom";
        String expectedHorse = "Nayy!";
        Assert.assertEquals(expectedPerson, person.makeNoise());
        Assert.assertEquals(expectedDuster, cropDuster.makeNoise());
        Assert.assertEquals(expectedChicken, chicken.makeNoise());
        Assert.assertEquals(expectedTractor, tractor.makeNoise());
        Assert.assertEquals(expectedHorse, horse.makeNoise());
    }
}

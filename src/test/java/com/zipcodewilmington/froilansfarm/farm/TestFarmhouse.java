package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farm.Farmhouse;
import com.zipcodewilmington.froilansfarm.people.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestFarmhouse {
    @Test
    public void testNullaryConstructor() {
        Farmhouse newFarmhouse = new Farmhouse();
        Assert.assertNotNull(newFarmhouse.getPeople());
    }

    @Test
    public void testSetPeople() {
        Farmhouse newFarmhouse = new Farmhouse();
        ArrayList<Person> abc = new ArrayList<>();
        newFarmhouse.setPeople(abc);

        Assert.assertEquals(abc, newFarmhouse.getPeople());
    }

}

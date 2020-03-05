package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.animals.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestChickenCoop {
    @Test
    public void testChickenCoop() {
        ChickenCoop newChickenCoop = new ChickenCoop();
        ArrayList<Integer> cc = new ArrayList<>();
        Assert.assertEquals(cc, newChickenCoop.getChickenCoop());
    }

}

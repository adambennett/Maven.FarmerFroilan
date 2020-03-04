package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestChickenCoop {
    @Test
    public void testChickenCoop() {
        ChickenCoop newChickenCoop = new ChickenCoop();
        ArrayList<Integer> cc = new ArrayList<>();
        newChickenCoop.setChickenCoop(cc);

        Assert.assertEquals(cc, newChickenCoop.getChickenCoop());
    }

}

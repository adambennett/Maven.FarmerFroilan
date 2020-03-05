package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestStable {

    @Test
    public void testNullaryConstructor(){
        // Given
        Stable stable = new Stable();

        // Then
        Assert.assertNotNull(stable.getHorses());
    }

    @Test
    public void testAdd(){
        // Given
        Stable stable = new Stable();
        Horse horse = new Horse();
        Integer expected = 1;

        // When
        stable.add(horse);
        Integer actual = stable.getHorses().size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetHorsey(){
        // Given
        Horse horse = new Horse();
        Horse horse1 = new Horse();
        ArrayList<Horse> horseys = new ArrayList<>();;
        horseys.add(horse);
        horseys.add(horse1);
        Stable stable = new Stable();
        Integer expected = 2;

        // When
        stable.setHorseList(horseys);
        Integer actual = horseys.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

}

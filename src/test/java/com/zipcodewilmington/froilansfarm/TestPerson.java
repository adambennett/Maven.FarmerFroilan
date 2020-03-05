package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testNullaryConstructor(){
        // Given
        Person person = new Person();
        String expected = null;

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName(){
        // Given
        Person person = new Person("Froilan");
        String expected = "Froilan";

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

}

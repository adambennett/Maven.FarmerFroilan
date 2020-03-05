package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoTest {

    @Test
    public void testClone() {
        Tomato bean = new Tomato();
        Tomato newBean = (Tomato) bean.clone();
        Assert.assertTrue(bean.hashCode()!=newBean.hashCode());
    }

    @Test
    public void testToString() {
        Tomato bean = new Tomato();
        Assert.assertTrue(bean.toString().equals("Tomato"));
    }
}
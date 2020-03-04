package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestBeanStalk {
    @Test
    public void testInheritance() {
        BeanStalk newBeanStalk = new BeanStalk();
        Assert.assertTrue(newBeanStalk instanceof Crop);
    }
}

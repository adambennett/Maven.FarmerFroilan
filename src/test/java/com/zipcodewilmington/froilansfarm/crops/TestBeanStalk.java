package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.crops.BeanStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import org.junit.Assert;
import org.junit.Test;

public class TestBeanStalk {
    @Test
    public void testInheritance() {
        BeanStalk newBeanStalk = new BeanStalk();
        Assert.assertTrue(newBeanStalk instanceof Crop);
    }
}

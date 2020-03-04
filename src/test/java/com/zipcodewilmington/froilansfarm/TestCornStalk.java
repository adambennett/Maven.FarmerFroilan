package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestCornStalk {

    @Test
    public void testInheritance() {
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }
}

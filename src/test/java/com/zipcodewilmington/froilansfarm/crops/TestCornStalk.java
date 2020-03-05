package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import org.junit.Assert;
import org.junit.Test;

public class TestCornStalk {

    @Test
    public void testInheritance() {
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }
}

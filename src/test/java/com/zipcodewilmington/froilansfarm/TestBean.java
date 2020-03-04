package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestBean {

    @Test
    public void testImplementation() {
        Bean bean = new Bean();
        Assert.assertTrue(bean instanceof Edible);
    }
}

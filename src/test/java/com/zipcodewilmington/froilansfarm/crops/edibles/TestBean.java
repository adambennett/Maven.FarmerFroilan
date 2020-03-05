package com.zipcodewilmington.froilansfarm.crops.edibles;

import com.zipcodewilmington.froilansfarm.crops.edibles.Bean;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestBean {

    @Test
    public void testImplementation() {
        Bean bean = new Bean();
        Assert.assertTrue(bean instanceof Edible);
    }

    @Test
    public void testClone() {
        Bean bean = new Bean();
        Bean newBean = (Bean) bean.clone();
        Assert.assertTrue(bean.hashCode()!=newBean.hashCode());
    }

    @Test
    public void testToString() {
        Bean bean = new Bean();
        Assert.assertTrue(bean.toString().equals("Bean"));
    }
}

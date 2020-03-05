package com.zipcodewilmington.froilansfarm.crops.edibles;

import com.zipcodewilmington.froilansfarm.crops.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestEarCorn {
    @Test
    public void testImplementation() {
        EarCorn newCorn = new EarCorn();
        Assert.assertTrue(newCorn instanceof Edible);
    }

    @Test
    public void testClone() {
        EarCorn bean = new EarCorn();
        EarCorn newBean = (EarCorn) bean.clone();
        Assert.assertTrue(bean.hashCode()!=newBean.hashCode());
    }

    @Test
    public void testToString() {
        EarCorn bean = new EarCorn();
        Assert.assertTrue(bean.toString().equals("EarCorn"));
    }
}

package com.zipcodewilmington.froilansfarm.crops.edibles;

import com.zipcodewilmington.froilansfarm.crops.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestTomato {

    @Test
    public void testImplementation(){
        Tomato tomato = new Tomato();
        boolean actual = tomato instanceof Edible;
        Assert.assertTrue(actual);
    }

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

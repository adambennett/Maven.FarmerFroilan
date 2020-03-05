package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EarCornTest {

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
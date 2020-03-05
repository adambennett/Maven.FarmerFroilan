package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeanTest {

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
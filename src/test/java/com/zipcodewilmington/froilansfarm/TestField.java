package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestField {

    @Test
    public void testField() {
        Field field = new Field();
        ArrayList<CropRow> row1 = new ArrayList<>();

        field.setCropRows(row1);

        Assert.assertEquals(row1, field.getCropRows());
    }
}

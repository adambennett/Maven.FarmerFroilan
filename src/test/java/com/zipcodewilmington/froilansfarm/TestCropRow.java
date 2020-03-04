package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCropRow {
    @Test
    public void testCropRow() {
        CropRow cropRow1 = new CropRow();
        ArrayList<Crop> cropList = new ArrayList<>();

        cropRow1.setNewCrop(cropList);

        Assert.assertEquals(cropList, cropRow1.getNewCrop());
    }
}

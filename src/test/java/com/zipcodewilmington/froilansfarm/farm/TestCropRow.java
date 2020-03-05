package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCropRow {
    @Test
    public void testCropRow() {
        CropRow cropRow1 = new CropRow();
        ArrayList<Crop> cropList = new ArrayList<>();

        cropRow1.setCropsList(cropList);

        Assert.assertEquals(cropList, cropRow1.getCrops());
    }
}

package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> crops;

    public CropRow() {

        this.crops = new ArrayList<>();
    }

    public void add(Crop crop) {
        this.crops.add(crop);
    }

    public ArrayList<Crop> getCrops() {
        return crops;
    }

    public void setCropsList(ArrayList<Crop> newCrop) {
        this.crops = newCrop;
    }
}

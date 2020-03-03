package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> newCrop;

    public CropRow() {

        this.newCrop = new ArrayList<>();
    }

    public ArrayList<Crop> getNewCrop() {
        return newCrop;
    }

    public void setNewCrop(ArrayList<Crop> newCrop) {
        this.newCrop = newCrop;
    }
}

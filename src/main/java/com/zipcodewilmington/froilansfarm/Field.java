package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field {

    private ArrayList<CropRow> cropRow;

    public Field() {
        cropRow = new ArrayList<>();
    }

    public ArrayList<CropRow> getCropRow() {
        return cropRow;
    }

    public void setCropRow(ArrayList<CropRow> cropRow) {
        this.cropRow = cropRow;
    }
}

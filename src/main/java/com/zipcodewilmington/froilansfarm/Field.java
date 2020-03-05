package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field {

    private ArrayList<CropRow> cropRows;

    public Field() {
        cropRows = new ArrayList<>();
        cropRows.add(new CropRow());
        cropRows.add(new CropRow());
        cropRows.add(new CropRow());
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }

    public void setCropRows(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }
}

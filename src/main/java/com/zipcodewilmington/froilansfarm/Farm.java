package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

import java.util.ArrayList;

public class Farm {

    private ArrayList<CropRow> cropRows;
    private ArrayList<ChickenCoop> chickenCoops;
    private Field field;
    private Farmhouse house;
    private ArrayList<Vehicle> vehics;

    public Farm() {
        cropRows = new ArrayList<>();
        chickenCoops = new ArrayList<>();
        vehics = new ArrayList<>();
        house = new Farmhouse();
        field = new Field();
    }


}

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

import java.util.ArrayList;

public class Farm {

    private ArrayList<ChickenCoop> chickenCoops;
    private Field field;
    private Farmhouse house;
    private ArrayList<Stable> stabs;
    private ArrayList<Vehicle> vehics;

    public Farm() {
        stabs = new ArrayList<>();
        chickenCoops = new ArrayList<>();
        vehics = new ArrayList<>();
        house = new Farmhouse();
        field = new Field();
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Farmhouse getHouse() {
        return house;
    }

    public void setHouse(Farmhouse house) {
        this.house = house;
    }

    public ArrayList<Stable> getStabs() {
        return stabs;
    }

    public void setStabs(ArrayList<Stable> stabs) {
        this.stabs = stabs;
    }

    public ArrayList<Vehicle> getVehics() {
        return vehics;
    }

    public void setVehics(ArrayList<Vehicle> vehics) {
        this.vehics = vehics;
    }


}

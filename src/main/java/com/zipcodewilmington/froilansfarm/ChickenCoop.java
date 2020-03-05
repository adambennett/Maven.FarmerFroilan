package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop {

    private ArrayList<Chicken> chickenCoop;

    public ChickenCoop() {

        this.chickenCoop = new ArrayList<>();
    }

    public ArrayList<Chicken> getChickenCoop() {
        return chickenCoop;
    }


    public void addChickens(int num){
        for(int i = 0; i < num; i++){
            chickenCoop.add(new Chicken());
        }
    }

}

package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Stable {

    private ArrayList<Horse> horseys = new ArrayList<>();

    public void add(Horse horse) {
        horseys.add(horse);
    }

    public ArrayList<Horse> getHorseys() {
        return horseys;
    }

    public void setHorseys(ArrayList<Horse> horseys) {
        this.horseys = horseys;
    }
}

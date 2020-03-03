package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Stable {
    public ArrayList<Horse> horses;

    public Stable() {
        this.horses = new ArrayList<Horse>();;
    }
  
    public void add(Horse horse) {
        horses.add(horse);
    }

    public ArrayList<Horse> getHorseys() {
        return horses;
    }

    public void setHorseys(ArrayList<Horse> horseys) {
        this.horses = horseys;
    }
}

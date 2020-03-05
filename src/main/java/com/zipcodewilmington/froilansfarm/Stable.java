package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horses;

    public Stable() {
        this.horses = new ArrayList<Horse>();;
    }
  
    public void add(Horse horse) {
        horses.add(horse);
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorseList(ArrayList<Horse> horseys) {
        this.horses = horseys;
    }
}

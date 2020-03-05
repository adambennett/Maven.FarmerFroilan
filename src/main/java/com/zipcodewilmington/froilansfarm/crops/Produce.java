package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Produce {

     private String name;
     private boolean hasBeenHarvested;
     private boolean hasBeenFertilized;
     private Edible toYield;

     public Produce(String name, Edible toYield) {
          this.name = name;
          this.toYield = toYield;
          this.hasBeenFertilized = false;
          this.hasBeenHarvested = false;
     }

     public Edible yield() {
          return hasBeenFertilized && hasBeenHarvested ? this.toYield : null;
     }

     public Edible getEdible() {
          return toYield;
     }

     public boolean isHarvested() {
          return hasBeenHarvested;
     }

     public boolean isFertilized() {
          return hasBeenFertilized;
     }

     public void setHarvested(boolean hasBeenHarvested) {
          this.hasBeenHarvested = hasBeenHarvested;
     }

     public void setFertilized(boolean hasBeenFertilized) {
          this.hasBeenFertilized = hasBeenFertilized;
     }
}

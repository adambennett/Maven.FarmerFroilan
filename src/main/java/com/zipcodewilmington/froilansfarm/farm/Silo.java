package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.edibles.Bean;
import com.zipcodewilmington.froilansfarm.crops.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.edibles.Egg;
import com.zipcodewilmington.froilansfarm.crops.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class Silo<K extends Edible> {
    private Map<K, Integer> inventory;
    private static final Silo global;

    private Silo() {
        inventory = new HashMap<>();
    }

    public static Silo getGlobal() { return global;  }

    public Integer reset() {
        clear();
        putInSilo((K) new Egg(), 49);
        putInSilo((K) new EarCorn(), 21);
        putInSilo((K) new Tomato(), 21);
        putInSilo((K) new Bean(), 5);
        return getNum();
    }

    public void clear() {
        inventory.clear();
    }

    public Integer getNum() {
        int sum = 0;
        for (Map.Entry<K, Integer> entry : inventory.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    public Map<Edible, Integer> getSilo() {
        return (Map<Edible, Integer>) inventory;
    }

    public void putInSilo(K edible) {
       putInSilo(edible, 1);
    }

    public void putInSilo(K edible, int amt) {
        if (inventory.containsKey(edible)) {
            inventory.put(edible, inventory.get(edible) + amt);
        } else {
            inventory.put(edible, amt);
        }
    }

    public Map<K, Integer> getRemoveMap(K edible) {
        Map<K, Integer> removeMap = new HashMap<>();
        for (Map.Entry<K, Integer> entry : inventory.entrySet()) {
            if (entry.getKey().toString().equals(edible.toString())) {
                removeMap.put(entry.getKey(), entry.getValue());
            }
        }
        return removeMap;
    }

    public Integer removeFrom(K edible, int amt) {
        int remove = amt;
        int removed = 0;
        Map<K, Integer> removeMap = getRemoveMap(edible);
        for (Map.Entry<K, Integer> entry : inventory.entrySet()) {
            if (removeMap.containsKey(entry.getKey()) && remove > 0) {
                int removeAmt = removeMap.get(entry.getKey());
                if (removeAmt > remove) {
                    removeAmt = remove;
                }
                remove -= removeAmt;
                removed += removeAmt;
                inventory.put(entry.getKey(), entry.getValue() - removeAmt);
                if (inventory.get(entry.getKey()) < 1) {
                    inventory.put(entry.getKey(), 0);
                }
            } else if (remove < 1) { break; }
        }
        return removed;
    }

    public Edible mostAbundant(){
        Integer highest = -1;
        K edible = null;
        for (Map.Entry<K, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > highest) {
                highest = entry.getValue();
                edible = entry.getKey();
            }
        }
        return edible;
    }

    public ArrayList<String> printInventory(){
        ArrayList<String> toRet = new ArrayList<>();
        for(Map.Entry<K, Integer> i: inventory.entrySet()){
            toRet.add(i.getKey() + " " +i.getValue());
        }
        return toRet;
    }

    static {
        try {
            global = new Silo();
            global.putInSilo(new Egg(), 49);
            global.putInSilo(new EarCorn(), 21);
            global.putInSilo(new Tomato(), 21);
            global.putInSilo(new Bean(), 5);
        } catch(Exception e) {
            throw new RuntimeException("Exception occurred in static initialization of Silo instance");
        }
    }

}

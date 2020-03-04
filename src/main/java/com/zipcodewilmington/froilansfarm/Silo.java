package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Silo {
    private static Map<String, Integer> inventory = new HashMap<String, Integer>();
    private static Integer minEggs = 49;
    private static Integer minCorn = 21;
    private static Integer minTomatos = 21;
    private static Integer minBeans = 5;

    public static Integer getNum() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

    public static Map<String, Integer> getSilo() {
        return inventory;
    }

    public static void increment(String silo) {
        if (inventory.containsKey(silo)) {
            inventory.put(silo, inventory.get(silo) + 1);
        } else {
            inventory.put(silo, 1);
        }
    }

    public static Integer removeFrom(String silo) {
       Map<String, Integer> removeMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getKey().equals(silo)) {
                if (!removeMap.containsKey(entry.getKey())) {
                    removeMap.put(entry.getKey(), 1);
                } else {
                    removeMap.put(entry.getKey(), removeMap.get(entry.getKey()) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (removeMap.containsKey(entry.getKey())) {
                int removeAmt = removeMap.get(entry.getKey());
                inventory.put(entry.getKey(), entry.getValue() - removeAmt);
                if (inventory.get(entry.getKey()) < 0) {
                    inventory.put(entry.getKey(), 0);
                }
                return removeAmt;
            }
        }
        return 0;
    }

    public static Integer removeFrom(String silo, int amt) {
        int sum = 0;
        for (int i = 0; i < amt; i++) {
            sum += removeFrom(silo);
        }
        return sum;
    }

    public static void harvestAndAdd(Crop crop) {
        increment(crop.toString());
    }

    public static String mostAbundant(){
        Integer highest = -1;
        String cropName = "";
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > highest) {
                highest = entry.getValue();
                cropName = entry.getKey();
            }
        }
        return cropName;
    }



    public static Boolean contains(String crop) {
        return inventory.containsKey(crop);
    }

}

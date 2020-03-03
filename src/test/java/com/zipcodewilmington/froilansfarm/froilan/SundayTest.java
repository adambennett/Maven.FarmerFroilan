package com.zipcodewilmington.froilansfarm.froilan;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Test;

import java.util.ArrayList;

public class SundayTest

{
    @Test
    public void test() {
        Froilan froilan = new Froilan();
        Stable staba = new Stable();
        Stable stablee = new Stable();
        Stable stab = new Stable();
        stab.add(new Horse());
        stab.add(new Horse());
        stab.add(new Horse());
        staba.add(new Horse());
        staba.add(new Horse());
        staba.add(new Horse());
        stablee.add(new Horse());
        stablee.add(new Horse());
        stablee.add(new Horse());
        ArrayList<Stable> stables = new ArrayList<>();
        stables.add(staba);
        stables.add(stablee);
        stables.add(stab);
        for (Stable s : stables) {
            for (Horse h : s.getHorseys()) {
                froilan.ride(h);
                froilan.feed(h, new EarCorn(), 3);
            }
        }




    }

}

package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.Horse;

public interface Rider {


    public void mount(Rideable thing);
    public void dismount(Rideable thing);

    public void ride(Horse h);


}

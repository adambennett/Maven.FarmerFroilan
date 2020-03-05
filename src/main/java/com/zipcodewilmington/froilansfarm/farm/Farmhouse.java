package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.people.Person;

import java.util.ArrayList;

public class Farmhouse {
    private ArrayList<Person> people;

    public Farmhouse() {
        people = new ArrayList<>();
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
}

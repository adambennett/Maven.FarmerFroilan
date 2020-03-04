package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farmhouse {
    private ArrayList<Person> people;

    public Farmhouse(ArrayList<Person> people) {
        this.people = people;
    }

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

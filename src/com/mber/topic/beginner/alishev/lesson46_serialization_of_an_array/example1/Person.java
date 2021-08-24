package com.mber.topic.beginner.alishev.lesson46_serialization_of_an_array.example1;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}

package com.mber.alishev.beginner._046serializingAnArray._3;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -73611773856616260L;
    private transient int id;
    public transient String name;

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

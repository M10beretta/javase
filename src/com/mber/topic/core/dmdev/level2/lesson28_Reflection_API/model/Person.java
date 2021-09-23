package com.mber.topic.core.dmdev.level2.lesson28_Reflection_API.model;

public abstract class Person {
    private long id;

    public Person(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}

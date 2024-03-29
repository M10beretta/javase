package com.mber.topic.reflection.alishev.lesson43;

import com.mber.topic.reflection.alishev.lesson42.Author;

@Author(name = "Maksim", dateOfCreation = 2021)
public class Person {
    private int id;
    private String name;

    public Person() {
        id = -1;
        name = "No name";
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Person with id: " + id + " and name: " + name + " says hello!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.mber.topic.collections.alishev.lesson12_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// интерфес Comparator

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(3,"Mike"));
        people.add(new Person(1,"Bob"));
        people.add(new Person(2,"Katy"));
        people.add(new Person(5,"Ed"));
        people.add(new Person(4,"Leo"));

        // порядок по id
        Collections.sort(people, Comparator.comparingInt(Person::getId));
        System.out.println(people);
        // порядок по name.length()
        Collections.sort(people, Comparator.comparingInt(o -> o.getName().length()));
        System.out.println(people);

    }
}

// не задан естетсвенный порядок

class Person{
    private int id;
    private String name;

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
        return  id + " " + name;
    }
}
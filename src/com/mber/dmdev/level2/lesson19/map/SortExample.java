package com.mber.dmdev.level2.lesson19.map;

import com.mber.dmdev.level2.lesson19.person.Person;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "456", "14", "678");

        Collections.sort(strings);

        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetikova")
        );

        Collections.sort(personList);

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

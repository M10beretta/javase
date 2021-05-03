package com.mber.dmdev.level2.lesson19.map;

import com.mber.dmdev.level2.lesson19.person.*;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Svetikova")
        );

        Collections.sort(personList);
        personList.sort(new Person.FirstNameComparator());
        personList.sort(Comparator.comparing(Person::getFirstName));
        personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));

        for (Person person : personList) {
            System.out.println(person);
        }

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

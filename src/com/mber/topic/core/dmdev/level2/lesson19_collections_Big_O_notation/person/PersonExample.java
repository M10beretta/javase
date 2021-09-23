package com.mber.topic.core.dmdev.level2.lesson19_collections_Big_O_notation.person;

public class PersonExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan2", "Ivanov");
        Person petr = new Person(1, "Ivan", "Ivanov3");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));
    }
}

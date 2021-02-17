package com.mber.dmdev.level2.lesson19.map;

import com.mber.dmdev.level2.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikova");
        Person tanya = new Person(30, "Tanya", "Toneva");
        Person lena = new Person(45, "Lena", "Lenova");
        Person katya = new Person(10, "Katya", "Kotova");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);
        map.putIfAbsent(tanya.getId(), tanya);
        map.putIfAbsent(lena.getId(), lena);
        map.putIfAbsent(katya.getId(), katya);


        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

package com.mber.dmdev.level2.lesson19.list;

import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");
        list.add("string5");

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);

        list.iterator().forEachRemaining(System.out::println);

    }
}


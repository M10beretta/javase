package com.mber.topic.lambda.alishev.lesson33_part2_implementing_Comparator;

/* реализуем Comparator, сравнение строк по длине
с помощью лямбда выражений и анонимных классов */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("Bye");
        list.add("Hi");
        list.add("Good afternoon");

        list.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(list);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length()) ;
            }
        });
        System.out.println(list);
    }

}

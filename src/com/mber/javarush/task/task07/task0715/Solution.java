package com.mber.javarush.task.task07.task0715;

import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
//        extracted1();
//        extracted2();
    }

    private static void extracted2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < 3; i++) {
            list.add(list.size() - i * 2, "именно");
        }

        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void extracted1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");

        for (String string : list) {
            System.out.println(string);
        }
    }
}
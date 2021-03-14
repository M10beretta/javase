package com.mber.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    private static void extracted2() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        for (String i : list) {
            System.out.println(i);
        }
    }

    private static void extracted1() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        for (int i = 0; i < 13; i++) {
            String string = strings.remove(4);
            strings.add(0, string);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
package com.mber.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/

public class Solution {

    public static void main(String[] args) throws IOException {

    }

    private static void extracted2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < list.get(i - 1).length()) {
                System.out.println(i);
                break;
            }
        }
    }

    private static void extracted1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        String bugString = strings.get(0);

        for (int i = 1; i < 10; i++) {
            if (strings.get(i).length() >= bugString.length()) {
                bugString = strings.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}
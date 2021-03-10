package com.mber.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution {

    public static void main(String[] args) throws IOException {
//        extracted1();
//        extracted2();

    }

    private static void extracted2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int countMax = 1;
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                if (countMax <= count) {
                    countMax = count;
                }
                count = 1;
            }
        }
        System.out.println(countMax);
    }

    private static void extracted1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            list.add(Integer.parseInt(string));
        }

        int count = 1;
        int max = 1;
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                max++;
            } else if (max > count) {
                count = max;
                max = 1;
            } else {
                max = 1;
            }
        }

        if (max > count) {
            count = max;
        }

        System.out.println(count);
    }
} 
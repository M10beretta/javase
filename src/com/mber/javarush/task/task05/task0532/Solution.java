package com.mber.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        extracted1();
        extracted2();
    }

    private static void extracted1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        if (number <= 0) {
            return;
        }

        int[] data = new int[number];
        for (int i = 0; i < number; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = data[0];
        for (int i = 1; i < number; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
            }
        }

        System.out.println(maximum);
    }

    private static void extracted2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int count = Integer.parseInt(reader.readLine());
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (maximum < number) {
                    maximum = number;
                }
            }
            System.out.println(maximum);
        }
    }
}
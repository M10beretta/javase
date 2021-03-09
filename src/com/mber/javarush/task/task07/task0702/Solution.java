package com.mber.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        extracted1();

    }

    private static void extracted1() throws IOException {
        String[] array = new String[8];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            array[i] = reader.readLine();
        }

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
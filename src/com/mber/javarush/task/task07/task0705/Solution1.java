package com.mber.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution1 {
    public static void main(String[] args) throws Exception {

    }

    private static void extracted1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
    }

    private static void extracted2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 20;
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int[] numbersSmall1 = new int[n / 2];
        int[] numbersSmall2 = new int[n / 2];

        for (int i = 0; i < numbersSmall1.length; i++) {
            numbersSmall1[i] = numbers[i];
        }
        for (int i = 0; i < numbersSmall2.length; i++) {
            numbersSmall2[i] = numbers[i + n / 2];
        }
        for (int i : numbersSmall2) {
            System.out.println(i);
        }
    }
}
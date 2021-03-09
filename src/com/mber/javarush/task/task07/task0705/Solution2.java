package com.mber.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 20;

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int[] numbersSmall1 = Arrays.copyOfRange(numbers, 0, n / 2);
        int[] numbersSmall2 = Arrays.copyOfRange(numbers, n / 2, n);

        for (int i : numbersSmall2) {
            System.out.println(i);
        }
    }
}
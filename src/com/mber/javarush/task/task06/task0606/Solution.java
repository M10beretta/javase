package com.mber.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
//        extracted1();
//        extracted2();
    }

    private static void extracted1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        while (count > 0) {
            if (count % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            count = count / 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }

    private static void extracted2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberString = reader.readLine();

        if (Integer.parseInt(numberString) <= 0 ) {
            return;
        }

        for (int i = 0; i < numberString.length(); i++) {

            if (numberString.charAt(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
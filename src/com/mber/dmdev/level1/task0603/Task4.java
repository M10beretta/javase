package com.mber.dmdev.level1.task0603;

/**
 * 4. Написать программу, определяющую, является ли введённое
 * целое число простым, т.е. делится без остатка только на 1 и само
 * на себя.
 */
public class Task4 {

    public static void main(String[] args) {
        for (int i = -10; i < 10; i++) {
            System.out.println(i + " " + isSimple1(i));

        }
    }

    public static boolean isSimple1(int value) {
        if (value > 0) {
            for (int i = 2; i < value; i++) {
                if (value % i == 0) return false;
            }
            return true;
        } else return false;
    }

    public static boolean isSimple2(int value) {
        if (value < 1) return false;

        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }

        return true;
    }
}

package com.mber.dmdev.level1.task0501;

/**
 * 1. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
 */
public class Task1 {
    public static void main(String[] args) {
        int firstValue = 8;
        int secondValue = 6;
        int result = getMax(firstValue, secondValue);
        System.out.println(result);
    }

    public static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else return secondValue;

    }
}

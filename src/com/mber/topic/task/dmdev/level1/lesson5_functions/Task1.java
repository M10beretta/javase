package com.mber.topic.task.dmdev.level1.lesson5_functions;

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
        return Math.max(firstValue, secondValue);
    }
}

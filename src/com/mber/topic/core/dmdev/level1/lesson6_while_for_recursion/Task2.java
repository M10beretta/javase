package com.mber.topic.core.dmdev.level1.lesson6_while_for_recursion;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 123456;
        int result1 = sum(value);
        System.out.println(result1);
        int result2 = sum(value);
        System.out.println(result2);
    }

    public static int sum(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

    public static int sumFor(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }
}

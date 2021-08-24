package com.mber.topic.beginner.dmdev.level1.lesson6_while_for_recursion;

/**
 * 1. Написать программу, высчитывающую факториал введённого целого числа.
 */
public class Task1 {
    public static void main(String[] args) {
        int value = 5;

        int result1 = factorial(value);
        System.out.println(result1);

        int result2 = factorialWhile(value);
        System.out.println(result2);

        int result3 = factorialRecursion(value);
        System.out.println(result3);

    }

    private static int factorial(int value) {
        int results = 1;
        for (int i = 1; i <= value; i++) {
            results *= i;
        }
        return results;
    }

    private static int factorialWhile(int value) {
        int results = 1;
        int i = 1;
        while (i <= value) {
            results *= i;
            i++;
        }
        return results;
    }

    private static int factorialRecursion(int value) {
        if (value == 1) return 1;
        return value * factorialRecursion(value - 1);
    }


}

package com.mber.dmdev.level1.lesson4;

/**
 * 2. Дано целое число. Определить, является ли последняя цифра этого числа – цифрой З.
 */

public class Task2 {
    public static void main(String[] args) {
        int value = 151652;
        testValue(value);
    }

    public static void testValue(int num) {
        if (num % 10 == 3) System.out.println("Последняя цифра этого числа является цифрой З");
        else System.out.println("Последняя цифра этого числа не является цифрой З");
    }
}

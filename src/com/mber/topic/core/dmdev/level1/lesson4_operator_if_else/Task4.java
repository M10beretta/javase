package com.mber.topic.core.dmdev.level1.lesson4_operator_if_else;

/**
 * 4. Написать программу, которая считывает год, введённый пользователем, и определяет, является ли этот год високосным.
 * Год считается високосным, если он делится без остатка на 4.
 * Однако, если год также делится 100, то этот год не високосный, за исключением годов, делящихся на 400.
 * Например:
 * 1992 — високосный
 * 1900 — не високосный
 * 2000 — високосный
 */

public class Task4 {
    public static void main(String[] args) {
        int year = 2000;
        isLeapYear(year);
        System.out.println(isLeapYearBoolean(year));
    }

    public static void isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " високосный");
        else
            System.out.println(year + " не високосный");
    }

    public static boolean isLeapYearBoolean(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

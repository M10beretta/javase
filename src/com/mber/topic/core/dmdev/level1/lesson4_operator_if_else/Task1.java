package com.mber.topic.core.dmdev.level1.lesson4_operator_if_else;

/**
 * 1. Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */

public class Task1 {
    public static void main(String[] args) {
        int month = 9;
        determiningTheTimeOfYear1(month);
        determiningTheTimeOfYear2(month);
    }

    public static void determiningTheTimeOfYear1(int month) {
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        }
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        } else
            System.out.println("Месяц введен не корректно");
    }

    public static void determiningTheTimeOfYear2(int month) {
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        }
        if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        }
        if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        }
        if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else
            System.out.println("Месяц введен не корректно");
    }
}

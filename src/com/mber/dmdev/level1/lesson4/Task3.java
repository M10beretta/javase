package com.mber.dmdev.level1.lesson4;

/**
 * З. Имеется целое число, вводимое пользователем с консоли. Это число — суме денег в рублях.
 * Вывести это число, добавив к нему слово ”рубль” в правильном падеже (”рубль”, “рублей", '“рубля”)
 */
public class Task3 {
    public static void main(String[] args) {
        int rubles = 15;
        toCorrectTheCase(rubles);

    }

    public static void toCorrectTheCase(int rubles) {
        if ((rubles % 10 == 1) && (rubles % 100 != 11)) System.out.println(rubles + " рубль");
        if ((rubles % 10 == 2) || (rubles % 10 == 3) || (rubles % 10 == 4)) System.out.println(rubles + " рубля");
        else System.out.println(rubles + " рублей");
    }
}
/*
рубль 1, !11, 21,
рубля 2, 3, 4, 22, 23, 24
рублей 5-20,
 */

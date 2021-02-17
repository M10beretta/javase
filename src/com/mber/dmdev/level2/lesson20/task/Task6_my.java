package com.mber.dmdev.level2.lesson20.task;

import java.util.Random;

/**
 * 6. Создать метод случайным образом выбрасывающий одно из 3-х видов
 * исключений.
 * Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */
public class Task6_my {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            catchException();
        }
    }

    private static void catchException() {
        try {
            for (int i = 0; i < 10; i++) {
                randomException();
            }
        } catch (ArithmeticException
                | ArrayIndexOutOfBoundsException
                | ArrayStoreException e) {
            System.out.println("словили исключение " + e.toString());

        }
    }

    public static void randomException() {
        switch (new Random().nextInt(3)) {
            case 0 -> throw new ArithmeticException();
            case 1 -> throw new ArrayIndexOutOfBoundsException();
            case 2 -> throw new ArrayStoreException();
        }
    }
}

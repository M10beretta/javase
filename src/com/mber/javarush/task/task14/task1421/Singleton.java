package com.mber.javarush.task.task14.task1421;

public class Singleton {
    // приватное статическое поле
    private static final Singleton instance = new Singleton();

    // приватный конструктор
    private Singleton() {
    }
    // метод возвращает объект, который по другому нельзя получить
    public static Singleton getInstance() {
        return instance;
    }
}


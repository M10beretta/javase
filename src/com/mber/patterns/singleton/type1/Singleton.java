package com.mber.patterns.singleton.type1;

/*
Lazy Initialization

Плюсы: Ленивая инициализация
Минусы: Не потокобезопасно
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

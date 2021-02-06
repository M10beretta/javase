package com.mber.patterns.singleton.method1;

/*
Ленивая инициализация.
Не потокобезопасный.
 */
public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}


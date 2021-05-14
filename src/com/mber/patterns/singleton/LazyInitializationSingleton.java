package com.mber.patterns.singleton;

/*
Lazy Initialization

Плюсы: Ленивая инициализация
Минусы: Не потокобезопасно
 */
public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
    }

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}

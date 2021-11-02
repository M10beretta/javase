package com.mber.topic.pattern.singleton.lazy_initialization_singleton;

/*
Lazy Initialization

Плюсы: Ленивая инициализация
Минусы: Не потокобезопасно
 */
public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}

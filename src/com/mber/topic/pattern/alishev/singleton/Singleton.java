package com.mber.topic.pattern.alishev.singleton;

public class Singleton {
    // В этой статической(!) переменной будет храниться единственный объект класса Singleton
    private static Singleton instance;

    // Скажем, что у нашего единственного объекта должно быть поле value
    private String value;

    // ВАЖНО: Конструктор должен быть приватным
    // Мы не хотим, чтобы пользователь мог создавать новые объекты класса Singleton
    private Singleton(String value) {
        this.value = value;
    }

    // Метод getter для поля value
    public String getValue() {
        return value;
    }

    // Вот этот статический метод будет вызывать пользователь, чтобы получить объект класса Singleton
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
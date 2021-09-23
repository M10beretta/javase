package com.mber.topic.core.dmdev.level2.lesson20_exception_handling.task;


import com.mber.topic.core.dmdev.level2.lesson20_exception_handling.exception.MberException;

/**
 * 4. Повторить предыдущее упражнение, но наследуя свой класс от класса
 * RuntimeException.
 * Добавить в конструктор своего класса возможность указания
 * сообщения.
 */
public class Task4 {
    public static void main(String[] args) {
        unsafe1();
        unsafe2();
    }

    public static void unsafe1() {
        throw new MberException("test exception");
    }

    public static void unsafe2() {
        throw new MberException(new RuntimeException("runtime exception"));
    }

}




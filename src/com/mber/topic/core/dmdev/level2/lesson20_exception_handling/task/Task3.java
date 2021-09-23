package com.mber.topic.core.dmdev.level2.lesson20_exception_handling.task;

import com.mber.topic.core.dmdev.level2.lesson20_exception_handling.exception.MberException;

/**
 * 3. Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в
 * консоль.
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe1();
            unsafe2();
        } catch (MberException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public static void  unsafe1() throws MberException {
        throw new MberException("test exception");
    }

    public static void  unsafe2() throws MberException {
        throw new MberException(new RuntimeException("runtime exception"));
    }
}


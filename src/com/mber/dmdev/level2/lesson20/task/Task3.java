package com.mber.dmdev.level2.lesson20.task;

import com.mber.dmdev.level2.lesson20.exception.MberException;

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
//            unsafe2();
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


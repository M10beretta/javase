package com.mber.topic.core.dmdev.level2.lesson20_exception_handling.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    public static void main(String[] args) throws FileNotFoundException, TimeoutException {
        System.err.println("main start");
        try {
            System.err.println(finallyTest());
            unsafe(10);
        } catch (RuntimeException exception) {
            System.err.println("catch");
            exception.printStackTrace();
        } finally {
            System.err.println("finally");
        }
        System.err.println("main end");
    }

    public static int finallyTest() {
        try {
            return 2;
        } catch (Throwable throwable) {
            return 3;
        } finally {
            return 4;
        }
    }

    public static void unsafe(int value) {
        System.err.println("unsafe start");
        if (value > 0) {
            throw new RuntimeException();
        }
        System.err.println("unsafe end");
        // code
    }
}

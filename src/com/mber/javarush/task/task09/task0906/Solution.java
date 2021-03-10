package com.mber.javarush.task.task09.task0906;

/*
Логирование стек-трейса
*/

public class Solution {

    public static void main(String[] args) {
        log("In main method");
        log2("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        String message = className + ": " + methodName + ": " + text;
        System.out.println(message);
    }

    public static void log2(String text) {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(className + ": " + methodName + ": " + text);
    }
}
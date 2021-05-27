package com.mber.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream); // заменили поток в консоль на поток в динамический массив
        testString.printSomething(); // печатаем в динамический массив
        String result = outputStream.toString().toUpperCase(); // получили строку из динамического массива
        System.setOut(out); // вернули вывод в консоль
        System.out.println(result); // печатаем измененную строку в консоль

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

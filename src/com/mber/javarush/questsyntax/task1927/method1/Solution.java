package com.mber.javarush.questsyntax.task1927.method1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();

        System.setOut(defaultPrintStream);

        String[] byteArray = byteArrayOutputStream.toString().split(System.lineSeparator());
        int i = 0;
        for (String s : byteArray) {
            System.out.println(s);
            if ((++i % 2) == 0)
                System.out.println("JavaRush - курсы Java онлайн");
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}







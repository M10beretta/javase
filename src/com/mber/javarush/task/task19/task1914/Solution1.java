package com.mber.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Решаем пример
*/

public class Solution1 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream bAos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bAos));
        testString.printSomething();
        System.setOut(out);

        Matcher matcher = Pattern.compile("((\\d+) ([+\\-*]) (\\d+))").matcher(bAos.toString());
        matcher.find();
        int a = Integer.parseInt(matcher.group(2)),
            b = Integer.parseInt(matcher.group(4)),
            result = 0;
        switch (matcher.group(3)) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
        }

        System.out.printf("%s = %d\n", matcher.group(1), result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

package com.mber.javarush.questsyntax.task1914.method1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
        testString.printSomething();
        System.setOut(out);

        Matcher matcher = Pattern.compile("((\\d+) ([+\\-*]) (\\d+))").matcher(stream.toString());
        matcher.find();
        int a = Integer.parseInt(matcher.group(2)),
            b = Integer.parseInt(matcher.group(4).toString()),
            result = 0;
        switch (matcher.group(3)) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
        }

        System.out.printf("%s = %d\n", matcher.group(1), result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

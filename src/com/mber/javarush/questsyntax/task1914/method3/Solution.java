package com.mber.javarush.questsyntax.task1914.method3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream bAoS = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(bAoS);
        System.setOut(printStream);
        testString.printSomething();
        String str = bAoS.toString();
        str = math(str);
        System.setOut(out);
        System.out.println(str);
    }

    public static String math(String str) {
        String[] strings = str.split(" ");
        str = str + resultMath(Integer.parseInt(strings[0]),strings[1],Integer.parseInt(strings[2]));
        return new StringBuilder(str).substring(0).replace("\r\n", "");
    }

    public static int resultMath(int a, String operator,int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a-b;
            case "*":
                return a*b;
        }
        return 0;
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("8 + 6 = ");
        }
    }
}
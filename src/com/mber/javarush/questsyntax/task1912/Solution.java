package com.mber.javarush.questsyntax.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream streamByte = new ByteArrayOutputStream();
        System.setOut(new PrintStream(streamByte));

        testString.printSomething();

        System.setOut(out);

        System.out.println(streamByte.toString().replaceAll("te", "??"));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
package com.mber.patterns.singleton.type3;

public class Test {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("Hello!");
        Singleton second = Singleton.getInstance("Goodbye!");

        // true
        System.out.println(first == second);

        // Hello!
        System.out.println(first.getValue());

        // Hello!
        System.out.println(second.getValue());
    }
}

package com.mber.javarush.task.task15.task1518;

/*
Статики и котики
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static Cat cat;

    public static class Cat {
        public String name;
    }

    static {
        Cat cat = new Cat();
        cat.name = "Пушок";

        Solution.cat = cat;
        System.out.println(cat.name);
    }
}
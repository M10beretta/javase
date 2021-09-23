package com.mber.topic.core.dmdev.level2.lesson18_generics.part1.list;

public class ListRunner {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");

        String element = list.get(1);
        System.out.println(element);
    }
}


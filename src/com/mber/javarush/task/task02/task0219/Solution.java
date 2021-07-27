package com.mber.javarush.task.task02.task0219;

/*
Печатаем трижды
*/

public class Solution {
    public static void print3(String text) {
        for (int i = 0; i < 3; i++) System.out.print(text + " ");

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
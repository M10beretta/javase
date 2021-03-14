package com.mber.javarush.task.task10.task1011;

/*
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {

    }

    private static void extracted2() {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] chars = text.toCharArray();
        for (int j = 0; j < 40; j++) {
            for (int k = j; k < chars.length; k++) {
                System.out.print(chars[k]);
            }
            System.out.println();
        }
    }

    private static void extracted1() {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        for (int i = 0; i < 40; i++) {
            System.out.println(text);
            text = text.substring(1);
        }
    }
}

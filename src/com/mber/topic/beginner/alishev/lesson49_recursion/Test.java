package com.mber.topic.beginner.alishev.lesson49_recursion;

// Рекурсия

public class Test {
    public static void main(String[] args) {
        recursiveCounter(10);
        System.out.println();
        cyclicDoWhileCounter(10);
        System.out.println();
        cyclicForCounter(10);
    }

    private static void recursiveCounter(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        recursiveCounter(n - 1);
    }

    private static void cyclicDoWhileCounter(int n) {
        int start = n;
        do {
            System.out.print(start-- + " ");
        } while (start > 0);
    }

    private static void cyclicForCounter(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }


}





package com.mber.alishev.algorithms.lesson2;

import java.util.Arrays;

/* Мемоизация - в программировании сохранение результатов выполнения функций для предотвращения повторных вычислений.
если не вызывалась, то функция вызывается, и результат её выполнения сохраняется;
если вызывалась, то используется сохранённый результат. */

public class Memoization {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            int n = 8_200;
            long[] mem = new long[n + 1];
            Arrays.fill(mem, -1);
            System.out.println(fibNaive(n, mem) + " time: " + (System.currentTimeMillis() - start));
        }
    }

    // n 8200 а дальше переполнение стека
    // O(n)
    private static long fibNaive(int n, long[] mem) {
        if (mem[n] != -1) return mem[n];
        if (n <= 1) return n;
        long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = result;
        return result;
    }
}

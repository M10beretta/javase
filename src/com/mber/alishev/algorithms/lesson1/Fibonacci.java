package com.mber.alishev.algorithms.lesson1;

/* Числа Фибоначчи - математическая модель, описывающая размножение кроликов
со второго месяца после своего рождения кролики начинают спариваться и каждый месяц производить новую пару кроликов
возможно, эта первая задача, моделирующая экспоненциальный рост популяции
если n=0 то F=0
если n=1 то F=1
если n>1 то F=Fпрошлое + Fпозапрошлое
0  1  2  3  4  5  6  7  8  9  10 11 12  13
0  1  1  2  3  5  8  13 21 34 55 89 144 233
пользователь вводит n, мы выводим F */
public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            System.out.println(fibNaive(30) + " time: " + (System.currentTimeMillis() - start));
        }
    }


    // n 30 наивный, медленный, очевидный
    // O(2^n)
    private static int fibNaive(int n) {
        if (n <= 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    // n 1_000_000  быстрее в 30_000 раз
    // O(n)
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1]; //O(n)
        arr[0] = 0; // O(1)
        arr[1] = 1; // O(1)
        for (int i = 2; i <= n; i++) { //O(n)
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n]; // O(1)
    }
}
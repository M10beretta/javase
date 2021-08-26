package com.mber.topic.algorithm.factorial;

import java.util.stream.IntStream;

public class Factorials {
    public static void main(String[] args) {
    }

    private static int factorialFor(int num) {
        if (num < 0) throw new RuntimeException("Недопустимый ввод");
        int result = 1;
        for (int i = 2; i <= num; i++) result *= i;
        return result;
    }

    private static int factorialStream(int num) {
        if (num < 0) throw new RuntimeException("Недопустимый ввод");
        return IntStream.rangeClosed(1, num).reduce(1, (x, y) -> x * y);
    }

    private static int factorialRecursive(int num) {
        if (num < 0) throw new RuntimeException("Недопустимый ввод");
        if (num == 0) return 1;
        if (num <= 2) return num;
        return num * factorialRecursive(num - 1);
    }
}

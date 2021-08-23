package com.mber.topic.algorithm.factorial;

import java.util.stream.IntStream;

public class Factorials {

    private static int factorialStream(int num) {
        return IntStream.rangeClosed(1, num).reduce(1, (x, y) -> x * y);
    }

    private static int factorialLegacy(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) result *= i;
        return result;
    }

    private static int factorialRecursive(int num) {
        if (num <= 2) {
            return num;
        }
        return num * factorialRecursive(num - 1);
    }
}

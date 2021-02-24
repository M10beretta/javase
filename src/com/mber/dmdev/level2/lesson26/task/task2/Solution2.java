package com.mber.dmdev.level2.lesson26.task.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Solution2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] values = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(300) + 1;
        }

        long startTime1 = System.currentTimeMillis();
        int result1 = findMax(values);
        System.out.println(result1 + ": " + (System.currentTimeMillis() - startTime1));

        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        long startTime2 = System.currentTimeMillis();
        int result2 = findMaxParallel(values, threadPool);
        System.out.println(result2 + ": " + (System.currentTimeMillis() - startTime2));
        threadPool.shutdown();
        threadPool.awaitTermination(1, TimeUnit.MINUTES);
    }

    private static int findMax(int[] values) {
        return IntStream.of(values)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    private static int findMaxParallel(int[] values, ExecutorService executorService) throws ExecutionException, InterruptedException {
        return executorService.submit(() -> IntStream.of(values)
                .parallel()
                .max()
                .orElse(Integer.MIN_VALUE)).get();
    }
}


package com.mber.topic.core.dmdev.level2.lesson26_concurrent.task.task1;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Solution2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService threadExecutor = Executors.newFixedThreadPool(3);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        while (scanner.hasNextInt()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) break;

            threadExecutor.submit(() -> {
                Integer counter = threadLocal.get();
                threadLocal.set(counter == null ? 1 : ++counter);
                System.out.printf("\nпоток %s , задач: %d", Thread.currentThread().getName(), counter);
                Thread.sleep(seconds * 1000L);
                System.out.printf("\nпоток %s спал %d секунд", Thread.currentThread().getName(), seconds);
                return null;
            });
        }
        threadExecutor.shutdown();
        threadExecutor.awaitTermination(1, TimeUnit.MINUTES);
    }
}


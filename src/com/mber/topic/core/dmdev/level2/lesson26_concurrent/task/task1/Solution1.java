package com.mber.topic.core.dmdev.level2.lesson26_concurrent.task.task1;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Solution1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService threadExecutor = Executors.newSingleThreadExecutor();

        while (scanner.hasNextInt()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) break;

            threadExecutor.submit(() -> {
                Thread.sleep(seconds * 1000L);
                System.out.printf("поток %s спал %d секунд\n", Thread.currentThread().getName(), seconds);
                return null;
            });
        }
        threadExecutor.shutdown();
        threadExecutor.awaitTermination(1, TimeUnit.MINUTES);
    }
}


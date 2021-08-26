package com.mber.topic.multithreading.alishev.lesson30;

// Callable и Future
// можем получать значения от потоков как от обычных методов
// можем пробрасывать исключения и ловить в главном потоке

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            action(executorService);
        }
        executorService.shutdown();
    }

    private static void action(ExecutorService executorService) {
        Future<Integer> future = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + " starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " finished");
            Random random= new Random();
            int randomValue = random.nextInt(10);
            if (randomValue < 5) throw new Exception("Something bad happened");
            return random.nextInt(10);
        });

        try {
            int result = future.get();
            System.out.println(Thread.currentThread().getName() + " return " + result + "\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        // обрабатываем перехваченое исключение ввыброшеннное нами в потоке
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(Thread.currentThread().getName() + " exception " + ex.getMessage() + "\n");
        }
    }
}

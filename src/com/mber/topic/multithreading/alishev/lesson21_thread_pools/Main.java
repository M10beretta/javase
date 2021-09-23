package com.mber.topic.multithreading.alishev.lesson21_thread_pools;

// пулы потоков

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));
        }
        // два потока начнут выполнять 5 заданий
        executorService.shutdown();
        System.out.println("All task submitted");
        // поток main здесь ждет
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}

class Work implements Runnable{
    private final int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was completed");
    }
}
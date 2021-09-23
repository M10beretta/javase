package com.mber.topic.multithreading.alishev.lesson29_thread_termination;

// прерывание потоков

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1000_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) break;
                    System.out.println("Thread was in");
                    Math.sin(random.nextInt(100));
                }
            }
        });

        System.out.println("Starting thread");
        thread.start();

        Thread.sleep(2000);
        thread.interrupt();

        System.out.println("Thread has finished");
    }

}

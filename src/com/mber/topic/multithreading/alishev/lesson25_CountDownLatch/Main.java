package com.mber.topic.multithreading.alishev.lesson25_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// CountDownLatch

public class Main {
    public static void main(String[] args) throws InterruptedException {
        extracted1();
        extracted2();
    }
    private static void extracted1() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(i, countDownLatch));
        }
        executorService.shutdown();

        countDownLatch.await();
        System.out.println("Latch has been opened, main thread is proceeding!");
    }
    private static void extracted2() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executorService.submit(new ProcessorWaiting(i, countDownLatch));
        }
        executorService.shutdown();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();
        }
    }
}

class Processor implements Runnable{
    private final int id;
    private final CountDownLatch countDownLatch;

    public Processor(int id, CountDownLatch countDownLatch) {
        this.id=id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownLatch.countDown();
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public int getId() {
        return id;
    }
}
class ProcessorWaiting extends Processor {

    public ProcessorWaiting(int id, CountDownLatch countDownLatch) {
        super(id, countDownLatch);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            getCountDownLatch().await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread with id " + getId() + " proceed");
    }
}
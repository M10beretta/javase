package com.mber.topic.core.dmdev.level2.lesson26_concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class BayerThread implements Runnable {

    private final Semaphore cashboxes;

    public BayerThread(Semaphore cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Semaphore cashboxes = this.cashboxes;
            cashboxes.acquire();
            System.out.println(Thread.currentThread().getName() + " обслуживается в какой-то кассе");
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождаю в какую-то кассу");
            cashboxes.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


package com.mber.dmdev.level2.lesson26.latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable{

    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("рокета готовится к запуску...");
        try {
            countDownLatch.await();
            System.out.println("пуск!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

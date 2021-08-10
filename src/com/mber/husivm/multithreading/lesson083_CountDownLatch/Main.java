package com.mber.husivm.multithreading.lesson083_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 10; i++) new Work(countDownLatch);
        countDownLatch.await();
        System.out.println("five works completed");
    }

}
class Work extends Thread{
    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("done work");
        countDownLatch.countDown();
    }
}
package com.mber.husivm.multithreading.lesson071_atomic_variables;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 5; j++) {
            MyThread myThread1 = new MyThread();
            MyThread myThread2 = new MyThread();
            myThread1.start();
            myThread2.start();

            myThread1.join();
            myThread2.join();

            System.out.println(i);
            i.set(0);
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int j = 0; j < 1_000_000; j++) i.incrementAndGet();
        }
    }
}

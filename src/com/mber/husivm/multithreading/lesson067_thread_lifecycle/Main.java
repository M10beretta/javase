package com.mber.husivm.multithreading.lesson067_thread_lifecycle;

// NEW RUNNABLE(running/ready) BLOCKED WAITING TIMED_WAITING TERMINATED

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread.start();
        thread.interrupt();
        Thread.yield();
        thread.setPriority(Thread.MAX_PRIORITY);
        try {
            thread.join();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }
}

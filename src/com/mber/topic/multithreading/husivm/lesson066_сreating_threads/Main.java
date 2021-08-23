package com.mber.topic.multithreading.husivm.lesson066_сreating_threads;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        // 1
        new MyThread().start();

        // 2
        new Thread(new MyRunnable()).start();

        // 3
        for (int i = 0; i < 400; i++)
            new Thread(() -> System.out.println("Threat name is - " + Thread.currentThread().getName())).start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        someMethod();
    }

    private void someMethod() {
        throw new RuntimeException();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


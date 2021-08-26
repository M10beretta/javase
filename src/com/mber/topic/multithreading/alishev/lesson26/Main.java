package com.mber.topic.multithreading.alishev.lesson26;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// ReentrantLock
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            extracted();
        }
    }

    private static void extracted() throws InterruptedException {
        Task task = new Task();
        Thread thread1 = new Thread(task::firstThread);
        Thread thread2 = new Thread(task::secondThread);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCounter();
    }
}

class Task {
    private int counter;
    private final Lock lock = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
        }
    }

    public void firstThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void secondThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void showCounter() {
        System.out.println(counter);
    }
}

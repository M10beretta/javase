package com.mber.topic.multithreading.alishev.lesson17_thread_creation;

// создание потоков

import static com.mber.topic.multithreading.alishev.lesson17_thread_creation.Main.action;

public class Main {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunner(), "MyRunner").start();
        new Thread(Main::action, "Lambda").start();
    }

    static void action() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " from " + Thread.currentThread().getName());
        }
    }
}

class MyRunner implements Runnable {
    @Override
    public void run() {
        action();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        setName("MyThread");
        action();
    }
}



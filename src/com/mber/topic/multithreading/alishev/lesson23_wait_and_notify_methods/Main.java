package com.mber.topic.multithreading.alishev.lesson23_wait_and_notify_methods;

// методы wait и notify

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(wn::produce);
        Thread thread2 = new Thread(wn::consume);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class WaitAndNotify {
    public void produce() {
        synchronized (this) {
            System.out.println("Producer thread starter...");
            try {
                // отдаем внутренний лок (монитор), ждем пока будет вызван notify() на этом объекте
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Waiting for return key pressed");
        scanner.nextLine();

        synchronized (this) {
            notify();
        }
    }
}


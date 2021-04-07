package com.mber.alishev.multithreading.lesson20;

// ключевое слово synchronized, применение локов

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Worker().actionMono();
        System.out.println();
        new Worker().actionParallel();
        System.out.println();
        new WorkerWithLocks().actionParallel();
        System.out.println();
        new WorkerWithoutLocks().actionParallel();
    }
}

// с задержкой быстрее в 2 раза , без задержки медленнее в 2.2 раза , нет смысла применять без задержки
class WorkerWithLocks extends Worker {
    // создали два лока
    final Object lock1 = new Object();
    final Object lock2 = new Object();

    void work() {
        for (int i = 0; i < 1000; i++) {
            // синхронизируемся на мониторах локов
            synchronized (lock1) {
                addToList(list1);
            }
            synchronized (lock2) {
                addToList(list2);
            }
        }
    }
}

// с задержкой быстрее в 2.2 раза (бысрее всех), без задержки медленнее в 1500 раз
class WorkerWithoutLocks extends Worker {

    void addToList(List<Integer> list) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // захват монитора объекта при добавлении
        synchronized (this) {
            list.add(random.nextInt(100));
        }
    }
}

// с задержкой без синхронизации пропускает элементы
class Worker {
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    void actionMono() {
        long before = System.currentTimeMillis();
        work();
        long after = System.currentTimeMillis();
        printResults(before, after);
    }

    void actionParallel() {

        Thread thread1 = new Thread(this::work);
        Thread thread2 = new Thread(this::work);

        actionTwoThread(thread1, thread2);
    }

    private void actionTwoThread(Thread thread1, Thread thread2) {
        long before = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();

        printResults(before, after);
    }

    private void printResults(long before, long after) {
        System.out.println("Program took " + (after - before) + " ms to run");
        System.out.println("List1 : " + list1.size());
        System.out.println("List2 : " + list2.size());
    }

    void work() {
        for (int i = 0; i < 1000; i++) {
            addToList(list1);
            addToList(list2);
        }
    }

    void addToList(List<Integer> list) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.add(random.nextInt(100));
    }
}



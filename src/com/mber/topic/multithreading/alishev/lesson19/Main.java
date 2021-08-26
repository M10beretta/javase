package com.mber.topic.multithreading.alishev.lesson19;

// ключевое слово synchronized, варианты синтаксиса

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private int counter;
    private static final List<Long> list = new ArrayList<>();


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Main main = new Main();
            main.doWork();
        }

        Thread.sleep(2000);
        list.sort(Long::compare);
        System.out.println(list.get(0) + " : " + list.get(list.size() - 1));

    }

    public void doWork() {

        LocalTime start = LocalTime.now();

        Thread thread1 = new Thread(this::counterLoopThis);
        thread1.start();
        Thread thread2 = new Thread(this::counterLoopThis);
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalTime finish = LocalTime.now();

        list.add(Duration.between(start, finish).toNanos());

        System.out.println(counter);

    }

    void counterLoop() {                        // 999400  : 37004700
        for (int i = 0; i < 10000; i++)         // 999700  : 39504100
            counter++;                          // 999700  : 208024300
    }

    void counterLoopThis() {                    // 998800  : 31504000
        for (int i = 0; i < 10000; i++)         // 1498600 : 97513000
            synchronized (this) {               // 2499900 : 102013100
                counter++;
            }
    }

    synchronized void counterLoopMethod() {     // 999400  : 29503200
        for (int i = 0; i < 10000; i++)         // 999600  : 32503900
            counter++;                          // 1000300 : 164520700

    }

    void counterLoopClass() {                   // 999700  : 39503800
        synchronized (Main.class) {             // 999900  : 81009900
            for (int i = 0; i < 10000; i++)     // 1000800 : 201526800
                counter++;
        }
    }
}

// нет никакой разницы
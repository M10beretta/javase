package com.mber.topic.core.dmdev.level2.lesson25_multithreading.counter;

public class CounterThread extends Thread{
    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.increment();

        }
    }
}

package com.mber.dmdev.level2.lesson25.task;

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

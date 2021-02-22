package com.mber.dmdev.level2.lesson25.task;

import java.util.List;
import java.util.Queue;

public class ProducerThread implements Runnable {
    private final Queue<Integer> list;


    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {

                if (list.size() < 10) {

                    int randomValue = RandomUtil.getRandom();
                    list.add(randomValue);
                    System.out.println("producer add value: " + randomValue + " . Size " + list.size());
                } else {
                    System.out.println("producer does nothing");
                }

//                list.notifyAll();
                try {
                    int randomWaitValue = 20;
                    System.out.println("producer waits: " + randomWaitValue + " ms");
                    list.notifyAll();
                    list.wait(randomWaitValue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


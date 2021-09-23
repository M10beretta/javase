package com.mber.topic.core.dmdev.level2.lesson26_concurrent.queue;

import java.util.concurrent.BlockingQueue;

public class BayerThread implements Runnable {

    private final BlockingQueue<Cashbox> cashboxes;

    public BayerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            Cashbox cashbox = cashboxes.take();
            System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
            cashboxes.add(cashbox);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


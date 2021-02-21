package com.mber.dmdev.level2.lesson25.queue;

import java.util.Queue;

public class BayerThread implements Runnable {

    private final Queue<Cashbox> cashboxes;

    public BayerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            while (true){

                if (!cashboxes.isEmpty()) {
                    Cashbox cashbox = cashboxes.remove();
                    System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);


                    Thread.sleep(5L);

                    System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
                    cashboxes.add(cashbox);

                } else {
                    System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу ");

                    Thread.sleep(5L);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


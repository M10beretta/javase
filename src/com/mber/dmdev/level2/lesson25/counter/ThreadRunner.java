package com.mber.dmdev.level2.lesson25.counter;

public class ThreadRunner {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Counter counter = getCounter();
            System.out.println(counter.getCount());
        }
    }

    private static Counter getCounter() {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        CounterThread counterThread4 = new CounterThread(counter);
        CounterThread counterThread5 = new CounterThread(counter);
        CounterThread counterThread6 = new CounterThread(counter);
        CounterThread counterThread7 = new CounterThread(counter);
        CounterThread counterThread8 = new CounterThread(counter);
        CounterThread counterThread9 = new CounterThread(counter);
        CounterThread counterThread10 = new CounterThread(counter);
        CounterThread counterThread11 = new CounterThread(counter);
        CounterThread counterThread12 = new CounterThread(counter);
        CounterThread counterThread13 = new CounterThread(counter);
        CounterThread counterThread14 = new CounterThread(counter);
        CounterThread counterThread15 = new CounterThread(counter);
        CounterThread counterThread16 = new CounterThread(counter);
        CounterThread counterThread17 = new CounterThread(counter);
        CounterThread counterThread18 = new CounterThread(counter);
        CounterThread counterThread19 = new CounterThread(counter);
        CounterThread counterThread20 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        counterThread4.start();
        counterThread5.start();
        counterThread6.start();
        counterThread7.start();
        counterThread8.start();
        counterThread9.start();
        counterThread10.start();
        counterThread11.start();
        counterThread12.start();
        counterThread13.start();
        counterThread14.start();
        counterThread15.start();
        counterThread16.start();
        counterThread17.start();
        counterThread18.start();
        counterThread19.start();
        counterThread20.start();

        try {
            counterThread1.join();
            counterThread2.join();
            counterThread3.join();
            counterThread4.join();
            counterThread5.join();
            counterThread6.join();
            counterThread7.join();
            counterThread8.join();
            counterThread9.join();
            counterThread10.join();
            counterThread11.join();
            counterThread12.join();
            counterThread13.join();
            counterThread14.join();
            counterThread15.join();
            counterThread16.join();
            counterThread17.join();
            counterThread18.join();
            counterThread19.join();
            counterThread20.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return counter;
    }
}

package com.mber.husivm.multithreading.lesson078_Conditions;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Main.AccountPlus().start();
            new Main.AccountMinus().start();
        }
    }

    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account = 0;

    static class AccountPlus extends Thread {
        @Override
        public void run() {
            lock.lock();
            account += 1;
            System.out.println(account + " after AccountPlus");
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread {
        @Override
        public void run() {
            lock.lock();
            if (account < 1) {
                try {
                    System.out.println(account + " before condition");
                    condition.await();
                    System.out.println(account + " after condition");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            account -= 1;
            System.out.println(account + " after AccountMinus");
            lock.unlock();
        }
    }
}

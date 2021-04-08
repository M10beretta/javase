package com.mber.alishev.multithreading.lesson28;

// взаимная блокировка Deadlock

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            actionRunner();
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            actionRunnerLock();
        }
    }

    private static void actionRunnerLock() throws InterruptedException {
        Runner runnerLock = new RunnerLock();
        Thread thread1 = new Thread(runnerLock::firstThread);
        Thread thread2 = new Thread(runnerLock::secondThread);
        timeStartJoinFinish(runnerLock, thread1, thread2);
    }

    private static void actionRunner() throws InterruptedException {
        Runner runner = new Runner();
        Thread thread1 = new Thread(runner::firstThread);
        Thread thread2 = new Thread(runner::secondThread);
        timeStartJoinFinish(runner, thread1, thread2);
    }

    private static void timeStartJoinFinish(Runner runner, Thread thread1, Thread thread2) throws InterruptedException {
        long timeMillis = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();

        System.out.println((System.currentTimeMillis() - timeMillis) + " time");
    }
}

// использование локов, помогают избежать вложенности
/* производительность выше в 100 раз чем при использовании synchronized метода
 и в 250 раз выше чем при использовании двойного synchronized*/
class RunnerLock extends Runner{
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    @Override
    public void firstThread() {
        lock1.lock();
        lock2.lock();
        try {
            Account.transfer(getAccount1(), getAccount2(), random.nextInt(100));
        } finally {
            lock1.unlock();
            lock2.unlock();
        }
    }

    @Override
    public void secondThread() {
        lock1.lock();
        lock2.lock();
        try {
            Account.transfer(getAccount2(), getAccount1(), random.nextInt(100));
        } finally {
            lock1.unlock();
            lock2.unlock();
        }
    }
}

// использование synchronized внутри synchronized
class Runner {
    private final Account account1 = new Account();
    private final Account account2 = new Account();
    private static final int OPERATIONS = 1000000;

    Random random = new Random();

    public void firstThread() {
        for (int i = 0; i < OPERATIONS; i++) {

            // замедляем время выполнения в 2.5 раза, чем если бы применили synchronized метода
            synchronized (account1) {
                synchronized (account2) {
                    Account.transfer(account1, account2, random.nextInt(100));
                }
            }
        }
    }

    public void secondThread() {
        for (int i = 0; i < OPERATIONS; i++) {
            synchronized (account1) {
                synchronized (account2) {
                    Account.transfer(account2, account1, random.nextInt(100));
                }
            }
        }
    }

    public void finished() {
        System.out.print((account1.getBalance() + account2.getBalance()) + " total balance  ");
    }

    public Account getAccount1() {
        return account1;
    }

    public Account getAccount2() {
        return account2;
    }
}


class Account {
    private int balance = 10000;

    public void deposit(int amount) {
        balance += amount;

    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}


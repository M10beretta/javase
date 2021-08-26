package com.mber.topic.multithreading.alishev.lesson28;

// взаимная блокировка Deadlock

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        actionRunner(new Runner());
        actionRunner(new RunnerSyn());
        actionRunner(new RunnerLockDoubleSyn());
        actionRunner(new RunnerLock());
        actionRunner(new RunnerLockNoDeadlock());
    }

    private static void actionRunner(Runner runner) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Thread thread1 = new Thread(runner::firstThread);
            Thread thread2 = new Thread(runner::secondThread);
            timeStartJoinFinish(runner, thread1, thread2);
        }
        List<Long> list = runner.getList();

        int sum = 0, count = 0;
        for (Long l : list) {
            sum += l;
            count++;
        }

        list.sort(Long::compare);

        System.out.println("\n" + list.get(0) + " : " + list.get(list.size() - 1)
                + " average " + sum / count
                + " from " + runner.getClass().getSimpleName() + "\n\n");
    }

    private static void timeStartJoinFinish(Runner runner, Thread thread1, Thread thread2) throws InterruptedException {
        long timeMillis = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finished();

        long operationTime = System.currentTimeMillis() - timeMillis;

        System.out.println(operationTime + " time");

        runner.getList().add(operationTime);
    }
}

// нет дедлока несмотря на неправильный порядок захвата локов
class RunnerLockNoDeadlock extends RunnerLock {

    private void takeLocks(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        /* если два лока не забрали, то отпускаем локи,
        чтобы другой поток мог забрать два лока одновременно
        выходим из метода только если успешно забрали два лока */

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();

            } finally {
                if (firstLockTaken && secondLockTaken) return;
                if (firstLockTaken) lock1.unlock();
                if (secondLockTaken) lock2.unlock();
            }

            // даем время другим потокам отдать локи, получается быстрее
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void firstThread() {
        for (int i = 0; i < getOPERATIONS(); i++) {
            takeLocks(getLock1(), getLock2());
            try {
                Account.transfer(getAccount1(), getAccount2(), random.nextInt(100));
            } finally {
                getLock1().unlock();
                getLock2().unlock();
            }
        }
    }

    @Override
    public void secondThread() {
        for (int i = 0; i < getOPERATIONS(); i++) {
            // неправильный порядок захвата локов
            takeLocks(getLock2(), getLock1());

            try {
                Account.transfer(getAccount2(), getAccount1(), random.nextInt(100));
            } finally {
                getLock1().unlock();
                getLock2().unlock();
            }
        }
    }
}


// использование локов, помогают избежать вложенности
// захватывать локи в разных потоках в одном порядке иначе возникает дедлок
class RunnerLock extends Runner {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    @Override
    public void firstThread() {
        for (int i = 0; i < getOPERATIONS(); i++) {
            lock1.lock();
            lock2.lock();
            try {
                Account.transfer(getAccount1(), getAccount2(), random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    @Override
    public void secondThread() {
        for (int i = 0; i < getOPERATIONS(); i++) {
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

    public Lock getLock1() {
        return lock1;
    }

    public Lock getLock2() {
        return lock2;
    }
}


// использование synchronized внутри synchronized
// захватывать локи в разных потоках в одном порядке иначе возникает дедлок
class RunnerLockDoubleSyn extends Runner {
    @Override
    public void firstThread() {
        for (int i = 0; i < getOPERATIONS(); i++) {
            synchronized (getAccount1()) {
                synchronized (getAccount2()) {
                    Account.transfer(getAccount1(), getAccount2(), random.nextInt(100));
                }
            }
        }
    }

    @Override
    public void secondThread() {
        for (int i = 0; i < getOPERATIONS(); i++) {
            synchronized (getAccount1()) {
                synchronized (getAccount2()) {
                    Account.transfer(getAccount2(), getAccount1(), random.nextInt(100));
                }
            }
        }
    }
}


// использование synchronized в методе
class RunnerSyn extends Runner {
    @Override
    public synchronized void firstThread() {
        for (int i = 0; i < getOPERATIONS(); i++) {
            Account.transfer(getAccount1(), getAccount2(), random.nextInt(100));
        }
    }

    @Override
    public synchronized void secondThread() {
        for (int i = 0; i < getOPERATIONS(); i++) {
            Account.transfer(getAccount2(), getAccount1(), random.nextInt(100));

        }
    }
}


class Runner {
    private final List<Long> list = new ArrayList<>();

    private final Account account1 = new Account();
    private final Account account2 = new Account();

    private static final int OPERATIONS = 1000000;

    Random random = new Random();

    public void firstThread() {
        for (int i = 0; i < OPERATIONS; i++) {
            Account.transfer(account1, account2, random.nextInt(100));
        }
    }

    public void secondThread() {
        for (int i = 0; i < OPERATIONS; i++) {
            Account.transfer(account2, account1, random.nextInt(100));
        }
    }

    public void finished() {
        System.out.print((account1.getBalance() + account2.getBalance()) + " total balance ");
    }

    public Account getAccount1() {
        return account1;
    }

    public Account getAccount2() {
        return account2;
    }

    public static int getOPERATIONS() {
        return OPERATIONS;
    }

    public List<Long> getList() {
        return list;
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


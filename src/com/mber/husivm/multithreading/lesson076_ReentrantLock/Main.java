package com.mber.husivm.multithreading.lesson076_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Resource resource = new Resource();
            resource.i = 0;
            resource.j = 0;

            MyThreat myThreat1 = new MyThreat();
            MyThreat myThreat2 = new MyThreat();

            myThreat1.setResource(resource);
            myThreat2.setResource(resource);

            myThreat1.start();
            myThreat2.start();

            myThreat1.join();
            myThreat2.join();

            System.out.println(resource.i);
            System.out.println(resource.j);
        }
    }

    static class MyThreat extends Thread {
        private Resource resource;

        public void setResource(Resource resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100000000; i++) {
                resource.changeI();
            }
        }
    }
}


class Resource {
    int i;
    int j;

    Lock lock = new ReentrantLock();

    public void changeI() {
        lock.lock();

        int i = this.i;
        i++;
        this.i = i;

        changeJ();
    }

    public void changeJ() {
        int j = this.j;
        j++;
        this.j = j;

        lock.unlock();
    }
}
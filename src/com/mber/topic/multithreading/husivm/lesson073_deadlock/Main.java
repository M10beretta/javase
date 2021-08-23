package com.mber.topic.multithreading.husivm.lesson073_deadlock;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            var resourceA = new ResourceA();
            var resourceB = new ResourceB();

            resourceA.resourceB = resourceB;
            resourceB.resourceA = resourceA;

            var myThreatA = new MyThreatA();
            var myThreatB = new MyThreatB();

            myThreatA.resourceA = resourceA;
            myThreatB.resourceB = resourceB;

            myThreatA.start();
            myThreatB.start();
        }
    }
}

class MyThreatA extends Thread {
    ResourceA resourceA;

    @Override
    public void run() {
        System.out.print(resourceA.getI() + " ");
    }
}

class MyThreatB extends Thread {
    ResourceB resourceB;

    @Override
    public void run() {
        System.out.print(resourceB.getI() + " ");
    }
}

class ResourceA {
    ResourceB resourceB;

    public synchronized char getI() {
        return resourceB.returnI();
    }

    public synchronized char returnI() {
        return 'a';
    }
}

class ResourceB {
    ResourceA resourceA;

    public synchronized char getI() {
        return resourceA.returnI();
    }

    public synchronized char returnI() {
        return 'b';
    }
}
package com.mber.husivm.multithreading.lesson068_synchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Resource resource = new Resource();

            MyThreat myThreat1 = new MyThreat();
            MyThreat myThreat2 = new MyThreat();

            myThreat1.setResource(resource);
            myThreat2.setResource(resource);

            myThreat1.start();
            myThreat2.start();

            myThreat1.join();
            myThreat2.join();

            System.out.println(resource.getI());
        }
    }
}

class MyThreat extends Thread {
    Resource resource;

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

class Resource {
    private int i = 0;

    public int getI() {
        return i;
    }

    public /*synchronized*/ void changeI() {  // longest
        /*synchronized (this) {*/             // longest
        int i = this.i;
        i++;
        this.i = i;
        /*}*/
    }

}
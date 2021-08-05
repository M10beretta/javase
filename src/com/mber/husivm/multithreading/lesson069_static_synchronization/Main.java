package com.mber.husivm.multithreading.lesson069_static_synchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            MyThreat myThreat1 = new MyThreat();
            MyThreat myThreat2 = new MyThreat();

            myThreat1.start();
            myThreat2.start();

            myThreat1.join();
            myThreat2.join();

            System.out.println(Resource.i);
        }
    }
}

class MyThreat extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100000000; i++) {
            Resource.changeStaticI();
        }
    }
}

class Resource {
    static int i = 0;

    public /*synchronized*/ static void changeStaticI() { // longest
        /*synchronized (Resource.class) {*/               // longest
            int i = Resource.i;
            i++;
            Resource.i = i;
        /*}*/
    }
}



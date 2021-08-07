package com.mber.husivm.multithreading.lesson082_Semofors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        var table = new Semaphore(2);

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(new Person());
            people.get(i).table = table;
            people.get(i).start();
        }
    }
}

class Person extends Thread {
    Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() + " waiting for table");

        try {
            table.acquire();
            System.out.println(this.getName() + " eat at the table");
            Thread.sleep(2000);
            System.out.println(this.getName() + " release table");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

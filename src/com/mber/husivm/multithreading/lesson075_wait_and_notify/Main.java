package com.mber.husivm.multithreading.lesson075_wait_and_notify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Operator().start();
        new Machine().start();
    }

    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    static class Operator extends Thread {
        @Override
        public void run() {
            var scanner = new Scanner(System.in);
            while (true) {
                synchronized (strings) {
                    strings.add(scanner.nextLine());
                    strings.notify();
                }
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Machine extends Thread {
        @Override
        public void run() {
            while (strings.isEmpty()) {
                synchronized (strings) {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(strings.remove(0));
                }
            }
        }
    }
}

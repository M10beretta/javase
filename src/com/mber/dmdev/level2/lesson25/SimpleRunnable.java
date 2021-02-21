package com.mber.dmdev.level2.lesson25;

public class SimpleRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from runnable: " + Thread.currentThread().getName());
    }
}

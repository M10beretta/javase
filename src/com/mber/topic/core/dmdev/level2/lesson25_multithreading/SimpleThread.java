package com.mber.topic.core.dmdev.level2.lesson25_multithreading;

public class SimpleThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from simple: " + getName());
    }
}

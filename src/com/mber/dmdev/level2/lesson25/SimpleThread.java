package com.mber.dmdev.level2.lesson25;

public class SimpleThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from simple: " + getName());
    }
}

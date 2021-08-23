package com.mber.topic.multithreading.husivm.lesson087_BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new PriorityBlockingQueue<>();

        for (int i = 0; i < 10; i++) {


        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    queue.put("this is string");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        }
    }
}

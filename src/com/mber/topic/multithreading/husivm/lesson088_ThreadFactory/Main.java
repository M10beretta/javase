package com.mber.topic.multithreading.husivm.lesson088_ThreadFactory;

import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) {
        var threadFactory = new ThreadFactory(){
            @Override
            public Thread newThread(Runnable r) {
                var thread = new Thread(r);
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
        threadFactory.newThread(new MyRun()).start();
    }

    static class MyRun implements Runnable{
        @Override
        public void run() {
            System.out.println(1);
        }
    }

}

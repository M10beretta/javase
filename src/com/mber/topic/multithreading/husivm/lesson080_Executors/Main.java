package com.mber.topic.multithreading.husivm.lesson080_Executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new MyRunnable());
        System.out.println(service.submit(new MyCallable()).get());
        service.shutdown();
    }


    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable{
        @Override
        public Object call() throws Exception {
            return "2";
        }
    }
}

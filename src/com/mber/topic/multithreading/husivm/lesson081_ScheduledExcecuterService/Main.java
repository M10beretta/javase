package com.mber.topic.multithreading.husivm.lesson081_ScheduledExcecuterService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.schedule(new MyThread(), 3, TimeUnit.SECONDS);
        service.shutdown();
    }

    static class MyThread extends  Thread{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}

package com.mber.dmdev.level2.lesson26.pool;

import java.util.concurrent.*;

public class ThreadPolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

    }

    private static void extracted1() {
        Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(5);
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(3);
        Executors.newWorkStealingPool();
    }

    private static void extracted2() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000L);
            System.out.println("It's callable");
            return 1;
        });
        System.out.println("Result " + future.get());
        threadPool.shutdown();
//        threadPool.awaitTermination(10000L, TimeUnit.SECONDS);
        System.out.println("main end");
    }

    private static void extracted3() {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
/*
        threadPool.schedule(() -> System.out.println("OK"), 3L, TimeUnit.SECONDS);
        threadPool.shutdown();
        threadPool.awaitTermination(1L,TimeUnit.HOURS);
*/
        threadPool.scheduleAtFixedRate(() -> System.out.println("OK"), 2L, 4L, TimeUnit.SECONDS);
    }
}

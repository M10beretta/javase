package com.mber.husivm.multithreading.lesson089_ForkJoinFramework;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    public static void main(String[] args) {
        var start = LocalTime.now();
        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        System.out.println(pool.invoke(new MyFork(0, numbOfOperations)));
        System.out.println(Duration.between(start, LocalTime.now()).getSeconds());
    }

    static long numbOfOperations = 10_000_000_000L;
    static int numOfThreads = Runtime.getRuntime().availableProcessors();

    static class MyFork extends RecursiveTask<Long> {
        long from, to;


        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to - from) <= numbOfOperations / numOfThreads) {
                long j = 0;
                for (long i = 0; i < numbOfOperations; i++) {
                    j += i;
                }
                return j;
            } else {
                long middle = (to + from) / 2;
                MyFork firstHalf = new MyFork(from, middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                Long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
        }
    }
}

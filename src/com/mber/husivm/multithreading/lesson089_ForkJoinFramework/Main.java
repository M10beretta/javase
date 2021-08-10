package com.mber.husivm.multithreading.lesson089_ForkJoinFramework;

import java.io.Serial;
import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    static long numOfOperations = 10_000_000_000L;
    static int numOfThreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
            var start1 = LocalTime.now();
            long j = 0;
            for (long i = 0; i < numOfOperations; i++) j += i;
            System.out.print(Duration.between(start1, LocalTime.now()).getSeconds() + " : ");

            // после 2-x циклов скорость сильно увеличивается из-за кэширования
            var start2 = LocalTime.now();
            ForkJoinPool pool = new ForkJoinPool(numOfThreads);
            pool.invoke(new MyFork(0, numOfOperations));
            System.out.println(Duration.between(start2, LocalTime.now()).getSeconds());
        }
    }

    static class MyFork extends RecursiveTask<Long> {
        @Serial
        private static final long serialVersionUID = -6329585497917836720L;

        long from, to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            // если операция разбита на достаточное количество частей, выполняем основной алгоритм
            if ((to - from) <= numOfOperations / numOfThreads) {
                long j = 0;
                for (long i = from; i < to; i++) {
                    j += i;
                }
                return j;
                // иначе разбиваем на две части
            } else {
                long middle = (to + from) / 2;
                //
                MyFork firstHalf = new MyFork(from, middle);
                firstHalf.fork();
                //
                MyFork secondHalf = new MyFork(middle + 1, to);
                Long secondValue = secondHalf.compute();

                return firstHalf.join() + secondValue;
            }
        }
    }
}

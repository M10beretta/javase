package com.mber.dmdev.level2.lesson26.barrier;

import com.mber.dmdev.level2.lesson26.latch.Rocket;

import java.util.Arrays;
import java.util.concurrent.*;

public class BarrierDemo {
    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetail.values().length, ()-> System.out.println("пуск"));
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Arrays.stream(RocketDetail.values())
                .map(detail->new RocketDetailRunnable(detail, cyclicBarrier))
                .forEach(threadPool::submit);

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.MINUTES);

    }


}

package com.mber.husivm.multithreading.lesson090_ThreadLocalRandom_and_TimeUnit;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ThreadLocalRandom.current().nextInt());

        Thread.sleep(TimeUnit.DAYS.toSeconds(14));
    }
}

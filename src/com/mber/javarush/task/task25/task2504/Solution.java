package com.mber.javarush.task.task25.task2504;

/*
Switch для нитей
*/

import java.util.Arrays;

public class Solution {
    public static void processThreads(Thread... threads) {
        Arrays.stream(threads)
                .forEach((t) -> {
                    switch (t.getState()) {
                        case NEW -> t.start();
                        case WAITING, TIMED_WAITING, BLOCKED -> t.interrupt();
                        case RUNNABLE -> t.isInterrupted();
                        case TERMINATED -> System.out.println(t.getPriority());
                    }
                });
    }

    public static void main(String[] args) {

    }
}

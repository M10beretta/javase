package com.mber.topic.core.dmdev.level2.lesson25_multithreading.task;

import java.util.Random;

public final class RandomUtil {

    public static final Random RANDOM = new Random();
    private static final int DEFAULT_BOUND = 10;

    public RandomUtil() {
    }

    public static int getRandom(){
        return RANDOM.nextInt(DEFAULT_BOUND);
    }
    public static int getRandom(int bound){
        return RANDOM.nextInt(bound);
    }
}


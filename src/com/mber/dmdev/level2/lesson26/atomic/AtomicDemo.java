package com.mber.dmdev.level2.lesson26.atomic;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        int value = atomicInteger.incrementAndGet();
        System.out.println(value);

        int newValue = atomicInteger.addAndGet(20);
        System.out.println(newValue);


//        Unsafe unsafe = Unsafe.getUnsafe();
    }
}


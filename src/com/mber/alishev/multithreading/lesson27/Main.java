package com.mber.alishev.multithreading.lesson27;

import java.util.concurrent.Semaphore;

// Semaphore

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);

        semaphore.acquire();
        semaphore.acquire();
        semaphore.acquire();
        // декрементировали permits до 0
        System.out.println("All permits have been acquired");

        semaphore.acquire();
        // этот метод не начнется пока где-то в другом потоке не будет вызван release
        System.out.println("Can't reach here...");
        // инкрементировали permits до 1
        semaphore.release();

        System.out.println(semaphore.availablePermits());
    }
}

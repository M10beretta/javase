package com.mber.husivm.multithreading.lesson085_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        var barrier = new CyclicBarrier(3, new Run());
        new Sportsman(barrier).start();
        new Sportsman(barrier).start();
        new Sportsman(barrier).start();
    }

    static class Run extends Thread {
        @Override
        public void run() {
            System.out.println("Run is begin");
        }
    }

    static class Sportsman extends Thread {
        CyclicBarrier barrier;

        public Sportsman(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}

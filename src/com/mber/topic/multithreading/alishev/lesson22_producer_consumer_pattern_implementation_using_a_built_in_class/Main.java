package com.mber.topic.multithreading.alishev.lesson22_producer_consumer_pattern_implementation_using_a_built_in_class;

// паттерн producer-consumer (производитель-потребитель)
// реализация с помощью встроенного класса

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        new Thread(Main::produce).start();
        new Thread(Main::consumer).start();
    }

    private static void produce() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(80);
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consumer() {
        while (true) {
            try {
                Thread.sleep(80);
                System.out.println(queue.size() + " " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

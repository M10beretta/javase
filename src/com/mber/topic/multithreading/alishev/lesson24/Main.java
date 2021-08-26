package com.mber.topic.multithreading.alishev.lesson24;

// паттерн producer-consumer (производитель-потребитель)
// реализация на более низком уровне

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(pc::produce);
        Thread thread2 = new Thread(pc::consume);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private static final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() {
        int value = 0;
        while (true) {
            synchronized (lock) {
                // while вместо if для дополнительной проверки (сомнительно)
                while (queue.size() == LIMIT) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.offer(value++);
                // оповещение для consume() что появилась возможность забрать элемент
                lock.notify();
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                // оповещение для produce() что появилась возможность положить элемент
                lock.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

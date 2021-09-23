package com.mber.topic.multithreading.alishev.lesson27_Semaphore;

// пример соединиения с сервером

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class MainServer {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(connection::work);
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}

class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;

    private Semaphore semaphore = new Semaphore(10);

    /* запрещаем пользователям создавать объекты этого класса,
    потому что Connection один,
    будем к нему обащаться из разных потоков

    паттерн синглтон */
    private Connection() {

    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() {
        try {
            // 11-й поток здесь остановится и будет ждать
            // в итоге все 200 потоков выполнят задание, порционно по 10 потоков
            semaphore.acquire();
            try {
                doWork();
            } finally {
                semaphore.release();
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void doWork() throws InterruptedException {

        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
        }
    }
}
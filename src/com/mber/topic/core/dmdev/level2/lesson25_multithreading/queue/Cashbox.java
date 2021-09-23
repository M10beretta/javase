package com.mber.topic.core.dmdev.level2.lesson25_multithreading.queue;

public class Cashbox {

    private static int generator = 1;
    private int id;

    public Cashbox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }
}

package com.mber.topic.core.dmdev.level2.lesson26_concurrent.semaphore;

public class Cashbox {

    private static int generator = 1;
    private final int id;

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

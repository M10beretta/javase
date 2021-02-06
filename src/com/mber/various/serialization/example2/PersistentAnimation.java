package com.mber.various.serialization.example2;
/*
http://ccfit.nsu.ru/~deviv/courses/oop/java_ser_rus.html
Несериализуемые объекты
 */
import java.io.Serializable;

public class PersistentAnimation implements Serializable, Runnable {
    transient private Thread animator;
    private int animationSpeed;

    public PersistentAnimation(int animationSpeed) {
        this.animationSpeed = animationSpeed;
        animator = new Thread(this);
        animator.start();
    }

    public void run() {
        while (true) {
            // выполнение анимации
        }
    }
}
package com.mber.various.serialization.example3;
/*
http://ccfit.nsu.ru/~deviv/courses/oop/java_ser_rus.html
Изменение протокола по умолчанию
 */

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistentAnimation implements Serializable, Runnable {
    transient private Thread animator;
    private int animationSpeed;

    public PersistentAnimation(int animationSpeed) {
        this.animationSpeed = animationSpeed;
        startAnimation();
    }

    public void run() {
        while (true) {
            // do animation here
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        // наш "псевдо-конструктор"
        in.defaultReadObject();
        // теперь мы вновь получили "живой" объект, поэтому давайте перестроим и запустим его
        startAnimation();

    }

    private void startAnimation() {
        animator = new Thread(this);
        animator.start();
    }
}
package com.mber.khasang.mvc_swing.model;

import java.util.concurrent.TimeUnit;

public class User {
    private int pin = 1234;

    public int getPin() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}

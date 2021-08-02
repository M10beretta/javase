package com.mber.megahub.post77;

import java.util.concurrent.Callable;

class Factorial implements Callable<Long> {
    private final int digit;

    Factorial(int digit) {
        this.digit = digit;
    }

    @Override
    public Long call() throws Exception {
        long factorial = 1;
        for (int i = 2; i < digit; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
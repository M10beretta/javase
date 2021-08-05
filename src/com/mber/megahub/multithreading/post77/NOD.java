package com.mber.megahub.multithreading.post77;

import java.util.concurrent.Callable;

class NOD implements Callable<Integer> {
    private int a;
    private int b;

    NOD(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
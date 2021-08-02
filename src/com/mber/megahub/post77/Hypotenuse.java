package com.mber.megahub.post77;

import java.util.concurrent.Callable;

class Hypotenuse implements Callable<Double> {
    private final int cathetusA;
    private final int cathetusB;

    Hypotenuse(int cathetusA, int cathetusB) {
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    @Override
    public Double call() throws Exception {
        double hypotenuse = Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2);

        return Math.sqrt(hypotenuse);
    }
}
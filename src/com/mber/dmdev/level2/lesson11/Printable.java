package com.mber.dmdev.level2.lesson11;

import java.util.Random;

interface Printable {
    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(generateRandom());
        print();
    }

    void print();

    private int generateRandom() {
        return RANDOM.nextInt();
    }
}

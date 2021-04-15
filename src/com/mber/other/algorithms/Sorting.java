package com.mber.other.algorithms;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

    public static void main(String[] args) {
        int[] ints = Arrays.stream(new int[1000])
                .map(v -> v = new Random().nextInt(100))
                .toArray();

        bubbleSorting(ints);
    }

    private static void bubbleSorting(int[] ints) {
        long start = System.currentTimeMillis();

        int length = ints.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (ints[i] > ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }

        System.out.println(System.currentTimeMillis() - start + " ms bubbleSorting");
    }
}
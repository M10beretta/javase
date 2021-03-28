package com.mber.other.algorithms;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] ints = {4, 2, 3, 4, 7, 43, 3, 6, 7, 324, 737, 8, 58, 3458};
        System.out.println(Arrays.toString(bubbleSorting(ints)));

    }

    private static int[] bubbleSorting(int[] ints) {
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
        return ints;
    }
}
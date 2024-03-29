package com.mber.topic.core.dmdev.level1.lesson7_arrays;

/**
 * 1. Написать программу, которая печатает массив
 * сначала в обычном порядке, затем в обратном.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] values = {1, 5, 7, 9, 11};
        printArray(values);
        printArrayReverse(values);
        printArrayForeach(values);

    }

    public static void printArray(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArrayReverse(int[] values) {
        for (int i = values.length-1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayForeach(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}

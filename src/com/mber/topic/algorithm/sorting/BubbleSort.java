package com.mber.topic.algorithm.sorting;

/* Пузырьковая сортировка
O(n^2) */

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            int[] arr = Arrays.stream(new int[10_000])
                    .map(v -> v = new Random().nextInt(100))
                    .toArray();
            long start = System.currentTimeMillis();
            bubbleSort(arr);
            System.out.println(System.currentTimeMillis() - start + " ms bubbleSort");
        }

        for (int i = 0; i < 30; i++) {
            int[] arr = Arrays.stream(new int[10_000])
                    .map(v -> v = new Random().nextInt(100))
                    .toArray();
            long start = System.currentTimeMillis();
            bubbleSortOptimised(arr);
            System.out.println(System.currentTimeMillis() - start + " ms bubbleSortOptimised");
        }
    }

    /* Пузырьковая сортировка O(n^2) , работает, меняя местами соседние элементы,
    если они находятся не в желаемом порядке. Этот процесс повторяется
    с начала массива, пока все элементы не будут в порядке.*/
    private static void bubbleSort(int[] arr) { // 50-100(40-400) 10_000
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Пузырьковая сортировка с оптимизацией  O(n^2), или O(n) если массив отсортирован
    private static void bubbleSortOptimised(int[] arr) { // 50-100(40-400)  10_000
        boolean swapped = false;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
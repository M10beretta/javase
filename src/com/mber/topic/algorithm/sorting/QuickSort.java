package com.mber.topic.algorithm.sorting;

/* Быстрая сортировка, сортировка Хоара
Худшее время	O(n^2)
Лучшее время	O(n log n) (обычное разделение) или O(n) (разделение на 3 части)
Среднее время	O(n log n)
Затраты памяти	O(n) вспомогательных, O(log n) вспомогательных
предпочтительнее MergeSort для сортировки массивов. */

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            int[] arr = Arrays.stream(new int[100_000])
                    .map(v -> v = new Random().nextInt(100))
                    .toArray();

            long start = System.currentTimeMillis();
            quickSort(arr, 0, arr.length - 1);
            System.out.println(System.currentTimeMillis() - start + " ms quickSort");
        }
    }

    private static void quickSort(int[] arr, int firstIndex, int lastIndex) { // 3-4(2-40)10_000  220-230(200-600)100_000
        if (firstIndex < lastIndex) {
            int pivotIndex = partition(arr, firstIndex, lastIndex);
            quickSort(arr, firstIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, lastIndex);
        }
    }

    static int partition(int[] arr, int firstIndex, int lastIndex) {
        int pivot = arr[lastIndex];
        int firstTempIndex = firstIndex;
        int lastTempIndex = lastIndex - 1;
        while (firstTempIndex <= lastTempIndex) {
            if (arr[firstTempIndex] >= pivot) {
                swap(arr, firstTempIndex, lastTempIndex);
                swap(arr, lastTempIndex + 1, lastTempIndex);
                lastTempIndex--;
            } else firstTempIndex++;
        }
        return lastTempIndex + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

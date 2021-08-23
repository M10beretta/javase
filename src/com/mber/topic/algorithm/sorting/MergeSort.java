package com.mber.topic.algorithm.sorting;

/* Сортировка слиянием
Худшее время	O(n log n)
Лучшее время	O(n log n)
Среднее время	O(n log n)
Затраты памяти	O(n) вспомогательных
предпочтительнее QuickSort для связанных списков */

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            int[] arr = Arrays.stream(new int[100_000])
                    .map(v -> v = new Random().nextInt(100))
                    .toArray();
            long start = System.currentTimeMillis();
            mergeSort(arr, arr.length);
            System.out.println(System.currentTimeMillis() - start + " ms mergeSort");
        }
    }

    private static void mergeSort(int[] arr, int size) {  // 20-40(10-200)100_000
        if (size < 2) return;
        int middleIndex = size / 2;
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[size - middleIndex];
        for (int i = 0; i < middleIndex; i++) leftArray[i] = arr[i];
        for (int i = middleIndex; i < size; i++) rightArray[i - middleIndex] = arr[i];
        mergeSort(leftArray, middleIndex);
        mergeSort(rightArray, size - middleIndex);
        merge(arr, leftArray, rightArray, middleIndex, size - middleIndex);
    }

    public static void merge(
            int[] arr, int[] leftArray, int[] rightArray, int leftArrayLength, int rightArrayLength) {

        int leftArrayIndex = 0, rightArrayIndex = 0, generalIndex = 0;
        while (leftArrayIndex < leftArrayLength && rightArrayIndex < rightArrayLength) {
            if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex])
                arr[generalIndex++] = leftArray[leftArrayIndex++];
            else arr[generalIndex++] = rightArray[rightArrayIndex++];
        }
        while (leftArrayIndex < leftArrayLength) arr[generalIndex++] = leftArray[leftArrayIndex++];
        while (rightArrayIndex < rightArrayLength) arr[generalIndex++] = rightArray[rightArrayIndex++];
    }
}

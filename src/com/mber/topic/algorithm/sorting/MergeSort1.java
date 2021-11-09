package com.mber.topic.algorithm.sorting;

/* Сортировка слиянием
Худшее время	O(n log n)
Лучшее время	O(n log n)
Среднее время	O(n log n)
Затраты памяти	O(n) вспомогательных
предпочтительнее QuickSort для связанных списков */

import java.util.Arrays;
import java.util.Random;

public class MergeSort1 {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            int[] arr = Arrays.stream(new int[100_000]).map(v -> v = new Random().nextInt(100)).toArray();
            long start = System.currentTimeMillis();
            mergeSort(arr, arr.length);
            System.out.println(System.currentTimeMillis() - start + " ms mergeSort");
        }
    }

    private static void mergeSort(int[] arr, int size) {  // 20-40(10-200)100_000
        if (size < 2) return;
        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];
        for (int i = 0; i < mid; i++) left[i] = arr[i];
        for (int i = mid; i < size; i++) right[i - mid] = arr[i];
        mergeSort(left, mid);
        mergeSort(right, size - mid);
        merge(arr, left, right, mid, size - mid);
    }

    public static void merge(
            int[] arr, int[] leftAr, int[] rightAr, int leftArLen, int rightArLen) {

        int left = 0, right = 0, general = 0;
        while (left < leftArLen && right < rightArLen) {
            if (leftAr[left] <= rightAr[right])
                arr[general++] = leftAr[left++];
            else arr[general++] = rightAr[right++];
        }
        while (left < leftArLen) arr[general++] = leftAr[left++];
        while (right < rightArLen) arr[general++] = rightAr[right++];
    }
}

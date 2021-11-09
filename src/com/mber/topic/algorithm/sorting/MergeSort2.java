package com.mber.topic.algorithm.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort2 {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            int[] arr = Arrays.stream(new int[100_000]).map(v -> v = new Random().nextInt(100)).toArray();
            long start = System.currentTimeMillis();
            mergeSort(arr, 0, arr.length - 1);
            System.out.println(System.currentTimeMillis() - start + " ms mergeSort");
        }
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                tmp[k++] = array[i++];
            } else {
                tmp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = array[i++];
        }
        while (j <= right) {
            tmp[k++] = array[j++];
        }

        i = left;
        k = 0;
        while (i <= right) {
            array[i++] = tmp[k++];
        }
    }
}

package com.mber.topic.algorithm.alishev.lesson10_BinarySearch;

// Бинарный поиск индекса элемента в массиве
// только в отсортированном массиве
// O (log n)

public class BinarySearch {
    public static void main(String[] args) {

        for (int i = -10; i < 30; i++) {
            int[] arr = {-1, 3, 5, 8, 10, 15, 16, 20};
            System.out.println("i= " + i + "  " + binarySearchCyclic(arr, i)
                    + ":" + binarySearchRecursive(arr, i));
        }
    }

    public static int binarySearchCyclic(int[] arr, int value) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int middle = first + (last - first) / 2;
            if (value < arr[middle]) last = middle - 1;
            else if (value > arr[middle]) first = middle + 1;
            else return middle;
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr, int value) {
        int first = 0;
        int last = arr.length - 1;
        return binarySearchRecursive(arr, value, first, last);
    }

    static int binarySearchRecursive(int[] arr, int value, int first, int last) {
        if (last >= first && first < arr.length) {
            int middle = first + (last - first) / 2;
            if (arr[middle] == value)
                return middle;
            if (arr[middle] > value)
                return binarySearchRecursive(arr, value, first, middle - 1);
            return binarySearchRecursive(arr, value, middle + 1, last);
        }
        return -1;
    }
}

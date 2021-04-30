package com.mber.alishev.algorithms.lesson10;

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
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            if (value < arr[middleIndex]) lastIndex = middleIndex - 1;
            else if (value > arr[middleIndex]) firstIndex = middleIndex + 1;
            else return middleIndex;
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr, int value) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        return binarySearchRecursive(arr, value, firstIndex, lastIndex);
    }

    static int binarySearchRecursive(int[] arr, int value, int firstIndex, int lastIndex) {
        if (lastIndex >= firstIndex && firstIndex < arr.length) {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            if (arr[middleIndex] == value)
                return middleIndex;
            if (arr[middleIndex] > value)
                return binarySearchRecursive(arr, value, firstIndex, middleIndex - 1);
            return binarySearchRecursive(arr, value, middleIndex + 1, lastIndex);
        }
        return -1;
    }
}

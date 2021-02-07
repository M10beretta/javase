package com.mber.dmdev.level1.task0703;

/**
 * 2. Написать программу, заносящую в массив первые целых чисел,
 * делящихся на 13 или на 17, и печатающую его.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] values1 = new int[100];
        fillArray1(values1);
        Task1.printArray(values1);

        System.out.println();

        int[] values2 = new int[100];
        fillArray2(values2);
        Task1.printArrayForeach(values2);
    }


    private static void fillArray1(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }

    public static void fillArray2(int[] values) {
        int currentIndex = 0, currentValue = 0;
        do {
            currentValue++;
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        } while (currentIndex != 100);
    }
}

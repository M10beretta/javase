package com.mber.topic.task.dmdev.level1.lesson7_arrays;

/**
 * 2. Написать программу, заносящую в массив первые целых чисел,
 * делящихся на 13 или на 17, и печатающую его.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] valuesFor = new int[100];
        fillArrayFor(valuesFor);
        Task1.printArray(valuesFor);

        System.out.println();

        int[] valuesDoWhile = new int[100];
        fillArrayDoWhile(valuesDoWhile);
        Task1.printArrayForeach(valuesDoWhile);
    }

    private static void fillArrayFor(int[] values) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                values[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }

    public static void fillArrayDoWhile(int[] values) {
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

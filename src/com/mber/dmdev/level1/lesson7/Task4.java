package com.mber.dmdev.level1.lesson7;

/**
 * 4. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */
public class Task4 {
    public static void main(String[] args) {

        int[] values = {1, 20, 0, 5, 6, -3, 10, 3};

        System.out.println(calculateSumBetween(values));
    }

    public static int indexOfMinValue(int[] values) {
        int index = 0;
        int minValue = values[index];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfMaxValue(int[] values) {
        int index = 0;
        int maxValue = values[index];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                index = i;
            }
        }
        return index;
    }

    public static int calculateSumBetween(int[] values) {
        int index1 = indexOfMinValue(values);
        int index2 = indexOfMaxValue(values);
        if (index1 > index2) {
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }

        int result = 0;
        for (int i = index1 + 1; i < index2; i++) {
            result += values[i];
        }
        return result;
    }
}




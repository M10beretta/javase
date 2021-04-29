package com.mber.alishev.algorithms.lesson5;
// Жадный алгоритм
// Дан неупорядоченный список цифр от 0 до 9. Составить из этих цифр наибольшее число.

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithm1 {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};

        System.out.println(getMaxNumberMy(digits));
        System.out.println(maxNumberFromDigits(digits));
        System.out.println(maxNumberFromDigitsLambdas(digits));
    }

    public static String maxNumberFromDigitsLambdas(int[] digits) {
        return String
                .join // объединили строки
                ("", Arrays // передали разделитель и массив строк
                        .stream(digits)// перевели в поток лямбда
                        .boxed() // обернули примитивы в классы обертки, т.к. используем на них compareTo
                        .sorted(Collections.reverseOrder()) // сортируем поставляя компаратор
                        .map(String::valueOf) // приводим числа в строки
                        .toArray(String[]::new)); // получили массив строк
    }

    public static String maxNumberFromDigits(int[] digits) {
        Arrays.sort(digits); // O(n log n)
        StringBuilder result = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            result.append(digits[i]);
        }
        return result.toString();
    }

    private static int getMaxNumberMy(int[] arr) {
        int length = arr.length;
        int[] copyArray = Arrays.copyOf(arr, length);
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            int index = 0;
            int max = copyArray[0];
            for (int j = 0; j < length; j++) {
                if (copyArray[j] > max) {
                    max = copyArray[j];
                    index = j;
                }
            }
            newArray[i] = max;
            copyArray[index] = -1;
        }
        return Integer.parseInt(Arrays.toString(newArray).replaceAll("[^(\\d)+]", ""));
    }
}

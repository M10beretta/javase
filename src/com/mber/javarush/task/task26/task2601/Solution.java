package com.mber.javarush.task.task26.task2601;

/*
Почитать в инете про медиану выборки
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[]{13, 8, 15, 5, 17})));
    }

    public static Integer[] sort(Integer[] array) {
        final double mediana = getMediana(array);
        Arrays.sort(array, (o1, o2) -> (int) (Math.abs(mediana - o1) - Math.abs(mediana - o2)));
        return array;
    }

    private static double getMediana(Integer[] array) {
        Arrays.sort(array);
        double res;
        int length = array.length;

        if (length % 2 == 1) res = array[length / 2];
        else res = (array[length / 2 - 1] + array[length / 2]) / 2.;
        return res;
    }
}

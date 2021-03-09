package com.mber.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort1(array);
        sort2(array);
        sort3(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sort2(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);

        for (int i = 0; i < copyArray.length; i++) {
            array[i] = copyArray[copyArray.length - 1 - i];
        }
    }

    public static void sort3(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = -array[i];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
            array[i] = -array[i];
    }
}

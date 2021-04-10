package com.mber.alishev.lambda.lesson34;

// использование лямбда выражений в специальных методах

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) arr[i] = i + 1;
        for (int i = 0; i < 10; i++) list.add(i + 1);


        arr = Arrays.stream(arr).map(v -> v * 2).toArray();
        list = list.stream().map(v -> v * 2).collect(Collectors.toList());



    }

    private static void print(int[] arr, List<Integer> list) {
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }

    private static void actionOldFor(int[] arr, List<Integer> list) {
        for (int i = 0; i < arr.length; i++) arr[i] = arr[i] * 2;
        for (int i = 0; i < list.size(); i++) list.set(i, list.get(i) * 2);
    }
}

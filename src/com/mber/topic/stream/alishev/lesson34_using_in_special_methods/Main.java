package com.mber.topic.stream.alishev.lesson34_using_in_special_methods;

// использование лямбда выражений в специальных методах

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    final static int NUMBER_OF_ELEMENTS = 10;

    public static void main(String[] args) {
        int[] arr; List<Integer> list;

        arr = initArr();
        list = initList();

        // for
        for (int i = 0; i < arr.length; i++) arr[i] = arr[i] * 2;
        for (int i = 0; i < list.size(); i++) list.set(i, list.get(i) * 2);

        printArrList("for", arr, list); arr = initArr(); list = initList();

        // map
        arr = Arrays.stream(arr).map(v -> v * 2).toArray();
        list = list.stream().map(v -> v * 2).collect(Collectors.toList());

        printArrList("map", arr, list); arr = initArr(); list = initList();

        arr = Arrays.stream(arr).map(v -> 3).toArray();
        list = list.stream().map(v -> 3).collect(Collectors.toList());

        printArrList("map", arr, list); arr = initArr(); list = initList();

        arr = Arrays.stream(arr).map(v -> v + 1).toArray();
        list = list.stream().map(v -> v + 1).collect(Collectors.toList());

        printArrList("map", arr, list); arr = initArr(); list = initList();

        // filter
        arr = Arrays.stream(arr).filter(v -> v % 2 == 0).toArray();
        list = list.stream().filter(v -> v % 2 == 0).collect(Collectors.toList());


        printArrList("filter", arr, list); arr = initArr(); list = initList();

        // reduce
        int asIntArr = Arrays.stream(arr).reduce(1, (acc, v) -> acc * v);
        int asIntList = list.stream().reduce(1, (acc, v) -> acc * v);

        System.out.println("reduce:\n" + asIntArr + "\n" + asIntList + "\n");
        arr = initArr(); list = initList();

        // можем вызывать методы один за одним
        arr = Arrays.stream(arr).filter(value -> value % 2 != 0).map(value -> value * 2).toArray();
        list = list.stream().filter(value -> value % 2 != 0).map(value -> value * 2).collect(Collectors.toList());

        printArrList("filter + map", arr, list); arr = initArr(); list = initList();

        // forEach
        System.out.println("forEach:");
        Arrays.stream(arr).forEach(v -> System.out.print(v + " "));
        System.out.println();
        list.forEach(v -> System.out.print(v + " "));
        System.out.println();
        System.out.println();

        // можем работат с любыми коллекциями
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);

        System.out.println("set:");
        System.out.println(set.stream().map(v -> v * 3).collect(Collectors.toSet()));
    }

    private static int[] initArr() {
        int[] arr = new int[NUMBER_OF_ELEMENTS];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;
        return arr;
    }

    private static List<Integer> initList() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) result.add(i + 1);
        return result;
    }

    private static void printArrList(String title, int[] arr, List<Integer> list) {
        System.out.println(title + ":");
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println();
    }
}

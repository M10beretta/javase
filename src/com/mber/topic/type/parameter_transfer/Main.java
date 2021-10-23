package com.mber.topic.type.parameter_transfer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final int[] arrInt = {1, 2, 3};
        final String[] arrStr = {"1", "2", "3"};
        final ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        final int _int = 1;
        final Integer integer = 1;

//        arrInt = new int[]{4,5,6};
//        arrStr = new String[]{"4","5","6"};
//        list = new ArrayList<>(List.of(4,5,6));
//        _int = 24;
//        integer = 24;

        arrInt[0] = 24;
        arrStr[0] = "24";
        list.set(0, 24);

        changeArrInt(arrInt);
        changeArrString(arrStr);
        changeList(list);
        changeInt(_int);
        changeInteger(integer);

        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrStr));
        System.out.println(list);
        System.out.println(_int);
        System.out.println(integer);
    }

    static void changeArrInt(int[] arrInt) {
        arrInt[1] = 42;
    }

    static void changeArrString(String[] arrStr) {
        arrStr[1] = "42";
    }

    static void changeList(List<Integer> list) {
        list.set(1, 42);
    }

    static void changeInt(int _int) {
        _int = 42;
    }

    static void changeInteger(Integer integer) {
        integer = 42;
    }
}






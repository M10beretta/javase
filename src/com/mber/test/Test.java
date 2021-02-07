package com.mber.test;

import java.util.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        test();

    }

    public static void test() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 0, -5, -7, -12, 5, 15);
        list.removeIf( x-> x<0 );
        list.forEach(System.out::print);
        System.out.println();
    }
}


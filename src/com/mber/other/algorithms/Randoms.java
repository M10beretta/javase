package com.mber.other.algorithms;

import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Randoms {
    public static void main(String[] args) {
        Stream.of(new TreeSet<Integer>()).peek(Randoms::add1).forEach(Randoms::print);
        Stream.of(new TreeSet<Integer>()).peek(Randoms::add2).forEach(Randoms::print);
        Stream.of(new TreeSet<Integer>()).peek(Randoms::add3).forEach(Randoms::print);
    }

    private static void print(TreeSet<Integer> set) {
        System.out.println(set.first() + " : " + set.last());
    }

    private static void add1(TreeSet<Integer> set) {
        for (int i = 0; i < 100; i++) set.add((int) (Math.random() * 6) + 1);
    }

    private static void add2(TreeSet<Integer> set) {
        for (int i = 0; i < 100; i++) set.add((int) Math.round(Math.random() * 5) + 1);
    }

    private static void add3(TreeSet<Integer> set) {
        for (int i = 0; i < 100; i++) set.add((new Random().nextInt(6) + 1));
    }
}

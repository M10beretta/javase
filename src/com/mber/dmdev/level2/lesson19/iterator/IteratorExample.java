package com.mber.dmdev.level2.lesson19.iterator;

import java.util.*;

// Способы итерации

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> sourceList = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>(sourceList);
        System.out.println(list);

        // for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // for-each
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // итератор + for
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // итератор + while
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // удаление элементов
        int value;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            value = iter.next();
            if (value % 2 == 0) iter.remove();
        }

        // лямбда
        list.forEach(v -> System.out.print(v + " "));
    }
}


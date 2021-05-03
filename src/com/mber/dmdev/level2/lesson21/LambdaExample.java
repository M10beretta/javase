package com.mber.dmdev.level2.lesson21;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparatorAnonymousClass = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        Comparator<Integer> comparatorOutdated  = ((o1, o2) -> Integer.compare(o1,o2));
        Comparator<Integer> comparator = (Integer::compare);
    }
}

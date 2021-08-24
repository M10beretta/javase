package com.mber.topic.collections.alishev.lesson12_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// интерфес Comparator

public class Main1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<String> animals = new ArrayList<>();
        numbers.add(4);
        numbers.add(9);
        numbers.add(0);
        numbers.add(8);
        numbers.add(4);
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("tiger");

        extracted1(numbers, animals);
        extracted2(numbers, animals);
        extracted3(numbers, animals);
    }


    // 3 замена на лямбда функции вместо анонимных классов, не связываясь с классами и объектами
    private static void extracted3(List<Integer> numbers, List<String> animals) {
        Collections.sort(numbers, (o1, o2) -> o2-o1);
        System.out.println(numbers);

        Collections.sort(animals, Comparator.comparingInt(String::length));
        System.out.println(animals);
    }


    // 2 можем использовать анонимные классы
    private static void extracted2(List<Integer> numbers, List<String> animals) {
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(numbers);

        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(animals);
    }


    private static void extracted3(List<String> animals) {
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);
    }

    // 1  можем создать свои классы реализующие компаратор
    private static void extracted1(List<Integer> numbers, List<String> animals) {
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        Collections.sort(numbers, new BackwardsIntegerComparator());
        System.out.println(numbers);
    }
}

// делаем свой собственный компаратор
// хотим что-бы сравнение было по длине строки
class StringLengthComparator implements Comparator<String> {
    // мы должны описать логику сравнения
    // по целому числу java понимает что один объект больше второго
    // конвенция о1 > o2 => 1; о1 < o2 => -1; о1 = o2 => 0;
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

// свой компаратор для чисел по убыванию
class BackwardsIntegerComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}



package com.mber.dmdev.level2.lesson21;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("8", "1", "3", "4", "5", "6", "2", "9", "7");

/*
        for (String string : strings) {
            String value = string + string;
            Integer intValue = Integer.valueOf(value);
            if (intValue % 2 == 0) {
                System.out.println(intValue);
            }
        }
*/

/*
        System.out.println();
*/

/*
        strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);

        System.out.println();
*/

/*
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
//                .mapToObj(Integer::valueOf)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
*/

//        IntStream
//        DoubleStream
//        LongStream

/*
        IntStream.of(1, 2, 3).forEach(System.out::println);
        List<String> list = Stream.of("11", "22", "33")
                .peek(System.out::println)
                .collect(Collectors.toList());
*/

/*
        IntStream.iterate(0, value -> value + 2)
                .skip(5)
                .limit(10)
                .forEach(System.out::println);
*/
/*
        IntStream.iterate(0, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand + 2;
            }
        })
                .skip(5)
                .limit(10)
                .forEach(System.out::println);
*/
    }
}

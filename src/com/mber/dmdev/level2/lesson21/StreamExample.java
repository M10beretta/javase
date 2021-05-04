package com.mber.dmdev.level2.lesson21;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("8", "1", "3", "4", "5", "6", "2", "9", "7");
    }

    private static void extracted7() {
        IntStream.iterate(0, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand + 2;
            }
        })
                .skip(5)
                .limit(10)
                .forEach(System.out::println);
    }

    private static void extracted6() {
        IntStream.iterate(0, value -> value + 2)
                .skip(5)
                .limit(10)
                .forEach(System.out::println);
    }

    private static void extracted5() {
        List<String> list = Stream.of("11", "22", "33")
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    private static void extracted4() {
        IntStream.of(1, 2, 3).forEach(System.out::println);
    }

    private static void extracted3(List<String> strings) {
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
    }

    private static void extracted2(List<String> strings) {
        strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    private static void extracted1(List<String> strings) {
        for (String string : strings) {
            String value = string + string;
            int intValue = Integer.parseInt(value);
            if (intValue % 2 == 0) {
                System.out.print(intValue + " ");
            }
        }
        System.out.println();
    }
}

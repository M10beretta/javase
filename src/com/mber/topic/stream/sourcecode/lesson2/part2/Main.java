package com.mber.topic.stream.sourcecode.lesson2.part2;

import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //  основные функциональные интерфейсы

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(4));
        System.out.println(isZero.test(0));


        Consumer<String> printer = System.out::println;
        printer.accept("Hello World!");


        Function<Integer, Double> converter = Double::valueOf;
        System.out.println(converter.apply(1));


        Supplier<String> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text: ");
            return scanner.nextLine();
        };
        System.out.println(text.get());


        UnaryOperator<Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(4.0));


        BinaryOperator<Double> pow = Math::pow;
        System.out.println(pow.apply(2.0,5.0));

    }
}

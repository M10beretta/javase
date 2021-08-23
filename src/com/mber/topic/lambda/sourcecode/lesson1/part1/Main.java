package com.mber.topic.lambda.sourcecode.lesson1.part1;

public class Main {
    public static void main(String[] args) {

        //  раньше нужно было создавать анонимный класс для реализации функционального интерфейса

        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1 + value2;
            }
        };
        System.out.println(operation.getResult(2.0, 2.0));

        //  пример нетерминального лямбда выражения - которое возвращает значение

        Operation lambda = Double::sum;
        System.out.println(lambda.getResult(3.0, 3.0));

        //  пример терминального лямбда выражения

        Printer printer = System.out::println;

        printer.println("Hello World!");

        //  пример блочного выражения

        Factorial factorial = value -> {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.getResults(5));

    }
}

package com.mber.sourcecode.lambdas.lesson1.part2;

public class Main {

    private static double value1 = 2.0, value2 = 2.0;

    public static void main(String[] args) {

        //  если в интерфейсе метод без параметров

        Operation operation = () -> value1 + value2;
        System.out.println(operation.getResult());
        System.out.println(value1);
        System.out.println(value2);

        System.out.println();

        //  блочное выражение

        Operation operationTwo = () -> {
            value1 = 100;
            return value1 + value2;
        };

        System.out.println(operationTwo.getResult());
        System.out.println(value1);
        System.out.println(value2);

        // переменные на уровне метода (если создать в методе main) можно использовать, но не изменять


    }
}

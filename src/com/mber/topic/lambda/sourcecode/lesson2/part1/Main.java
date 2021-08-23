package com.mber.topic.lambda.sourcecode.lesson2.part1;

public class Main {
    public static void main(String[] args) {
        //  если пока не знаем какой тип возвращаемого значения будем использовать
        //  обобщенные функциональные итерфейсы

        Operation<Integer> addition = Integer::sum;
        System.out.println(addition.getResult(2,2));

        Operation<String> concatenation = (value1, value2) -> value1 + value2;
        System.out.println(concatenation.getResult("2","2"));
    }
}

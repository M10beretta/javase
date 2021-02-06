package com.mber.test;

import java.util.Arrays;
import java.util.Formatter;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(new Cat("Tom", 2));
        System.out.println(new Cat());

    }

    private static void test() throws InterruptedException {
        String string = "которую будем делить на части";
        StringTokenizer tokenizer = new StringTokenizer(string, " ");
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());

        }
    }

    static class Cat {

        String name;
        int age = 1;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Cat() {
            this.name = "Leo";
        }

        @Override
        public String toString() {
            return  name + '\''  + age;
        }
    }

    static class Car{
        String model;
        int age;
        Car(String model, int age) {
            this.model = model;
            this.age = age;
        }

        public Car() {
            this("Mazda", 2022);
        }
    }

}



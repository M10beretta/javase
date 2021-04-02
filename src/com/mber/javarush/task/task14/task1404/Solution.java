package com.mber.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        extracted1(reader);
    }

    private static void extracted2(BufferedReader reader) throws IOException {
        while (true) {
            String name = reader.readLine();
            if (name.equals("")) break;
            Cat cat = CatFactory.getCatByKey(name);
            System.out.println(cat.toString());
        }
    }

    private static void extracted1(BufferedReader reader) throws IOException {
        String key; while (!(key = reader.readLine()).equals("")) {
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat.toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = switch (key) {
                case "vaska" -> new MaleCat("Василий");
                case "murka" -> new FemaleCat("Мурочка");
                case "kiska" -> new FemaleCat("Кисюлька");
                default -> new Cat(key);
            };
            return cat;
        }
    }

    static class Cat {
        private final String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
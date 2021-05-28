package com.mber.javarush.task.task20.task2010;

/*
Как сериализовать что-то свое?
*/

import java.io.Serial;
import java.io.Serializable;

public class Solution {
    public static class Object implements Serializable {
        @Serial
        private static final long serialVersionUID = 445913154204027282L;
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String implements Serializable {
        @Serial
        private static final long serialVersionUID = 6188275089202800249L;
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) {

    }
}
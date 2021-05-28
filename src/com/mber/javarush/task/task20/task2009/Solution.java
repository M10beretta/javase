package com.mber.javarush.task.task20.task2009;

/*
Как сериализовать static?
*/

import java.io.Serial;
import java.io.Serializable;

public class Solution {
    public static class ClassWithStatic implements Serializable {
        @Serial
        private static final long serialVersionUID = -4705416973933366382L;
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}

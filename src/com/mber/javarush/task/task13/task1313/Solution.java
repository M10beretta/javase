package com.mber.javarush.task.task13.task1313;

import java.awt.*;

/*
Лисица — это такое животное
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        // использование анонимного класса
        Animal fox = new Fox() {
            @Override
            public Color getColor() {
                return Color.red;
            }
        };
        System.out.println(fox.getColor());


        // использование лямбда выражения
        Animal foxLambda = () -> Color.red;
        System.out.println(foxLambda.getColor());
    }


    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
package com.mber.javarush.task.task13.task1316;

/*
Некорректные строки
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {
        String NAME = "Submit";

        void onPress();

        String onPress(Object o);
    }
}

/*
final все поля
public все методы
private методы должны быть реализованы
default методы должны быть реализованы
protected нельзя
*/

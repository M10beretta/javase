package com.mber.javarush.task.task10.task1002;

/*
Задача №2 на преобразование целых типов

Правильно расставь операторы приведения типа, чтобы получился ответ: d=3.765.
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = a / (float) b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
/*
Людмила 16 уровень, Санкт-Петербург
8 июля 2020, 23:25
Если кого-то интересует вот этот момент 1e-3  ,

то это 1* 10 ^(-3)

10 в минус 3 степени  - это то же самое, что 1 разделить на 10 в третьей степени

1e-3 = 0.001

Также по теме задачи с приведением типов советую статью
https://javarush.ru/quests/lectures/questsyntaxpro.level04.lecture06
*/
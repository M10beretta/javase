package com.mber.javarush.questsyntaxpro.lecture1401.example1;
/*
Исключения в Java-программах
2. Перехват исключений try-catch
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println("Адронный Коллайдер запущен");

        try {
            запуститьАдронныйКоллайдер(1);
            запуститьАдронныйКоллайдер(0);
        } catch (Exception e) {
            System.out.println("Ошибка! Перехвачено исключение");
            System.out.println("Планету засосало в черную дыру!");
        }

        System.out.println("Адронный Коллайдер остановлен");
    }

    public static void запуститьАдронныйКоллайдер(int n) {
        System.out.println("Все отлично работает: " + n);
        System.out.println(2 / n);
        System.out.println("Никаких проблем нет: " + n);
    }
}

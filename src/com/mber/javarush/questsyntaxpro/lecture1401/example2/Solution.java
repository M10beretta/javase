package com.mber.javarush.questsyntaxpro.lecture1401.example2;
/*
3. Несколько блоков catch
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println("Начало метода main");
        try {
            calculate(0);
        } catch (ArithmeticException e) {
            System.out.println("Было деление на 0");
        } catch (Exception e) {
            System.out.println("Перехвачено какое-то исключение");
        }

        System.out.println("Конец метода main");
    }

    public static void calculate(int n) {
        System.out.println("calculate начало: " + n);
        System.out.println(2 / n);
        System.out.println("calculate конец: " + n);
    }
}
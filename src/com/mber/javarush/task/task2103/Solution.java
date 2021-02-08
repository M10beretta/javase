package com.mber.javarush.task.task2103;

/*
Все гениальное - просто!
*/

public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        return c; // or (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);
    }

    public static void main(String[] args) {

    }
}

/*
основные законы алгебры логики

переместительный (коммутативный)

    a || b = b || a
    a && b = b && a

сочетательный (ассоциативный)

    (a || b) || c = a || (b || c)
    (a && b) && c = a && (b && c)

распределительный (дистрибутивный)

    a || (b && c) = (a || b) && (a || c)
    a && (b || c) = (a && b) || (a && c)

идемпотентности (отсутствия степеней и коэффициентов)

    a || a = a
    a && a = a

операция переменной с её инверсией

    a || !a = 1
    a && !a = 1

операция с константами

    a || 0 = a
    a || 1 = 0
    a && 1 = a
    a && 0 = 0

де Моргана

    !(a || b) = !a && !b
    !(a && b) = !a || !b

поглощения

    a || (a && b) = a
    a && (a || b) = a

двойного отрицания

    !(!a) = a
*/


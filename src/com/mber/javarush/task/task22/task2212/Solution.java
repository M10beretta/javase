package com.mber.javarush.task.task22.task2212;

/*
Проверка номера телефона
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] numbers = new String[]{
                "+380501234567",
                "+38(050)1234567",
                "+38050123-45-67",
                "050123-4567",
                "+38)050(1234567",
                "+38(050)1-23-45-6-7",
                "050ххх4567",
                "050123456",
                "(0)501234567"
        };

        Arrays.stream(numbers).forEach(x-> System.out.println(checkTelNumber(x)));
    }

    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;

        return (telNumber.matches("^\\+(\\d[\\-\\(\\)]?){11}\\d$")
                || telNumber.matches("^[\\(\\d]-?(\\d[\\-\\)]?){8}\\d$"))
                && telNumber.matches("^(\\+)?(\\d)*(\\(\\d{3}\\))?(\\d+-?\\d+-?)?\\d+$");
    }
}

/*
Как правильно сравнить две строки в Java?
Как правильно сравнить две строки в Java игнорируя регистр букв?
Как отсортировать список строк в алфавитном порядке?
В какой кодировке хранятся строки в Java?
Как преобразовать строку в кодировку Windows-1251?
Как разбить строку на отдельные слова?
Как развернуть строку задом наперед?
Что происходит, когда мы пишем "A" + "b" + "C"?
Что такое mutable и immutable типы?
1Что дает типу String то, что его сделали immutable?
 */
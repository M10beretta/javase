package com.mber.javarush.task.task08.task0827;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd2("May 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long time = currentDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;
    }

    /* современный вариант */
    public static boolean isDateOdd2(String date) {
        var formatter = DateTimeFormatter.ofPattern("MMM d yyyy", Locale.ENGLISH);
        var currentDate = LocalDate.parse(date, formatter).withMonth(1).withDayOfMonth(1);
        var startDate = LocalDate.parse(date, formatter);
        var days = Period.between(startDate, currentDate).getDays();
        return days % 2 == 0;
    }
}
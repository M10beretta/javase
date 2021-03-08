package com.mber.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(new Date()));

        /* современный вариант */
        var formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        System.out.println(formatter.format(LocalDate.now()));

    }

}
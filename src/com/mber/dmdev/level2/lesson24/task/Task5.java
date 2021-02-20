package com.mber.dmdev.level2.lesson24.task;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 4. Создать объект LocalDate, представляющий собой сегодняшнюю
 * дату. Создать объект LocalDate, представляющий собой дату
 * 07.07.2018. Используя созданные объекты, найти количество дней между
 * этими двумя датами.
 */
public class Task5 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);
        Period period = Period.between(prevDate, now);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        long between = ChronoUnit.DAYS.between(prevDate, now);
        System.out.println(between);


        long between1 = ChronoUnit.DAYS.between(LocalDate.of(1986, 12, 10), LocalDate.now());
        System.out.println(between1);
    }
}

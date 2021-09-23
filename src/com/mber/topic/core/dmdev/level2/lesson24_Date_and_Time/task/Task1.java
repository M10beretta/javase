package com.mber.topic.core.dmdev.level2.lesson24_Date_and_Time.task;

import java.time.LocalDateTime;

/**
 * 1. Создать объект LocalDateTime, представляющий собой
 * дату 25.06.2020 19:47. Используя этот объект, создать другой объект LocalDateTime,
 * представляющий собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объеты LocalDate and LocalTime.
 */
public class Task1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 25,19, 47);
        LocalDateTime newLocalDateTime = localDateTime.plusMonths(3);
        System.out.println(newLocalDateTime.toLocalDate() + " " + newLocalDateTime.toLocalTime());

    }
}

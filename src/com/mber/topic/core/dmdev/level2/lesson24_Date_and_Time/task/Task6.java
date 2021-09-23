package com.mber.topic.core.dmdev.level2.lesson24_Date_and_Time.task;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 5. Даны два объекта LocalDate из предыдущего задания. Подсчитать количество
 * секунд между полуночью первой даты и полуночью второй даты.
 */
public class Task6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);
        LocalDateTime localDateTimeNow = now.atStartOfDay();
        LocalDateTime localDateTimePrev = prevDate.atStartOfDay();
        Duration between = Duration.between(localDateTimePrev, localDateTimeNow);
        System.out.println(between.getSeconds());
    }
}

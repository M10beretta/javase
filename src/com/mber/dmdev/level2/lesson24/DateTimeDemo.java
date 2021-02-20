package com.mber.dmdev.level2.lesson24;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);

        LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}

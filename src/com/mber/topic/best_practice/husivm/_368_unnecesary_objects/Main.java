package com.mber.topic.best_practice.husivm._368_unnecesary_objects;


import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        UnnecessaryObjects unnecessaryObjects = new UnnecessaryObjects();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            unnecessaryObjects.isBabyBoomer2(new Date());
        }
        System.out.println(System.currentTimeMillis() - begin);
    }
}

class UnnecessaryObjects {

    //objects will be created at each startup
    public boolean isBabyBoomer1(Date birthDate) {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT")); //2 obj
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime(); //1 obj
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();   //1 obj
        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }


    //best
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT")); //2 obj
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime(); //1 obj
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();   //1 obj
    }

    public boolean isBabyBoomer2(Date birthDate) {
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
    }
}
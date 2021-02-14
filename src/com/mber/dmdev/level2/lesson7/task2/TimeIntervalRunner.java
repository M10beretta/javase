package com.mber.dmdev.level2.lesson7.task2;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(30, 2, 1);
        timeInterval1.print();

        TimeInterval timeInterval2 = new TimeInterval(timeInterval1.totalSeconds()+200);
        timeInterval2.print();

        timeInterval1.sum(timeInterval2).print();

    }
}

package com.mber.dmdev.level2.task0702;

public class TimeInterval {
    public static final int SEC = 60;
    public static final int MIN = 60;
    private final int seconds;
    private final int minutes;
    private final int hours;


    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / (SEC * MIN);
        this.minutes = totalSeconds % (SEC * MIN) / SEC;
        this.seconds = totalSeconds % (SEC * MIN) % SEC;
        ;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }


    public int totalSeconds() {
        return seconds + minutes * SEC + hours * MIN * SEC;
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(totalSeconds() + second.totalSeconds());
    }

    public void print() {
        System.out.printf("h %d, m %d, s %d\n", hours, minutes, seconds);

    }

}

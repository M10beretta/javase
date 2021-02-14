package com.mber.dmdev.level2.lesson7.task2;

public class TimeInterval {
    public static final int SECOND_IN_MINUTE = 60;
    public static final int MINUTE_IN_HOUR = 60;
    private final int seconds;
    private final int minutes;
    private final int hours;


    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / (SECOND_IN_MINUTE * MINUTE_IN_HOUR);
        this.minutes = totalSeconds % (SECOND_IN_MINUTE * MINUTE_IN_HOUR) / SECOND_IN_MINUTE;
        this.seconds = totalSeconds % (SECOND_IN_MINUTE * MINUTE_IN_HOUR) % SECOND_IN_MINUTE;
        ;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }


    public int totalSeconds() {
        return seconds + minutes * SECOND_IN_MINUTE + hours * MINUTE_IN_HOUR * SECOND_IN_MINUTE;
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(totalSeconds() + second.totalSeconds());
    }

    public void print() {
        System.out.printf("h %d, m %d, s %d\n", hours, minutes, seconds);

    }

}

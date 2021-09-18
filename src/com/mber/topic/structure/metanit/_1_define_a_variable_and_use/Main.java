package com.mber.topic.structure.metanit._1_define_a_variable_and_use;

public class Main {

    public static void main(String[] args) {
        Day current = Day.MONDAY;
        System.out.println(current);    // MONDAY
    }
}

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

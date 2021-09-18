package com.mber.topic.best_practice.husivm._385_immutable_objects;

import java.util.Date;

//copy when return
//copy when use
//don' t use clone
//check after and check on ended params //time-of-check time-of-use race condition
//use long
public class Main {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period3 p = new Period3(start, end);
        System.out.println(p);
    }
}

//best
final class Period3 {
    private final long start;
    private final long end;

    /**
     * @param start the beginning of the period
     * @param end   the end of the period; must not precede start
     * @throws IllegalArgumentException if start Is after end
     * @throws NullPointerException     if start or end is null
     */
    public Period3(Date start, Date end) {
        this.start = start.getTime();
        this.end = end.getTime();
        if (this.start < this.end)
            throw new IllegalArgumentException(this.start + " after" + this.end);
    }

    public Date start() {
        return new Date(start);
    }

    public Date end() {
        return new Date(end);
    }
}

final class Period2 {
    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period
     * @param end   the end of the period; must not precede start
     * @throws IllegalArgumentException if start Is after end
     * @throws NullPointerException     if start or end is null
     */
    public Period2(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.compareTo(end) > 0)
            throw new IllegalArgumentException(this.start + " after" + this.end);
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
}

//bad
final class Period1 {
    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period
     * @param end   the end of the period; must not precede start
     * @throws IllegalArgumentException if start Is after end
     * @throws NullPointerException     if start or end is null
     */
    public Period1(Date start, Date end) {
        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + " after" + end);
        this.start = start;
        this.end = end;
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }
}







/*
class MyDate extends Date{
    @Override
    public Object clone() {
        //some bad code
        System.out.println("some bad code");
        return super.clone();
    }
}*/

package com.mber.various.serialization.example1;
/*
http://ccfit.nsu.ru/~deviv/courses/oop/java_ser_rus.html
Изучите секреты Java Serialization API
 */

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class PersistentTime implements Serializable {
    private Date time;

    public PersistentTime() {
        time = Calendar.getInstance().getTime();
    }

    public Date getTime() {
        return time;
    }
}


package com.mber.topic.best_practice._375_how_to_create_immutable_classes;

import com.mber.javarush.task.task24.task2404.Point;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//how to make immutable
//1. no setters
//2. private final fields
//3. final
//4. don't return mutable objects
//        advantages - simple, thread safe no sync, good for cashing, final class final fields
//        Date -> LocalDate
//public class Main {
public class Main {
    Point point;
    Date date;
}

//1
final class  MyClass1 {
    private final int i;
    private final Object object;
    private final List<String> list;

    public MyClass1(int i, Object object, List<String> list) {
        this.i = i;
        this.object = object;
        this.list = list;
    }

    public int getI() {
        return i;
    }

    public Object getObject() {
        // return clone object
        return null;
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }
}

//2
class MyClass2{
    private final int i;

    private MyClass2(int i) {
        this.i = i;
    }

    public static MyClass2 getInstance(int i) {
        return new MyClass2(i);
    }

    public int getI() {
        return i;
    }
}
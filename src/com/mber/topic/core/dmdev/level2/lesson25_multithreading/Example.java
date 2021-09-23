package com.mber.topic.core.dmdev.level2.lesson25_multithreading;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private final List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }
}

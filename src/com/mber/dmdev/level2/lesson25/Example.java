package com.mber.dmdev.level2.lesson25;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private final List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
//        this.list = List.copyOf(list);
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
//        return list;
    }
}

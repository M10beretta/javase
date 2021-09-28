package com.mber.topic.stream.sourcecode.lesson2.part1;

public interface Operation<T> {
    T getResult(T value1, T value2);
}

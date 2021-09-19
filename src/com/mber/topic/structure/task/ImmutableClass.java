package com.mber.topic.structure.task;

import java.util.ArrayList;
import java.util.List;


public final class ImmutableClass {
    private final String name;
    private final int age;
    private final List<String> principles;

    public ImmutableClass(String name, int age, List<String> principles) {
        this.name = name;
        this.age = age;
        this.principles = new ArrayList<>(principles);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getPrinciples() {
        return new ArrayList<>(principles);
    }
}


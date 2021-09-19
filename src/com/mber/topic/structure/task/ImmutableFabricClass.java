package com.mber.topic.structure.task;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableFabricClass {
    private final String name;
    private final int age;
    private final List<String> principles;


    private ImmutableFabricClass(String name, int age, List<String> principles) {
        this.name = name;
        this.age = age;
        this.principles = new ArrayList<>(principles);
    }


    public static ImmutableFabricClass getInstance(String name, int age, List<String> things) {
        return new ImmutableFabricClass(name, age, things);
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

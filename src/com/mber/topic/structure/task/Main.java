package com.mber.topic.structure.task;

import java.util.List;

class Main {
    public static void main(String[] args) {
        ImmutableClass immutableClass =
                new ImmutableClass("Mike", 22, List.of("honesty", "openness"));

        ImmutableFabricClass instance =
                ImmutableFabricClass.getInstance("Mike", 22, List.of("honesty", "openness"));

        Planet[] values = Planet.values();

        String name = Planet.MERCURY.getName();
        Planet.MARS.getName();

        Planet.setKey("уку");
        String key = Planet.getKey();


    }
}

package com.mber.topic.structure.task;

public enum Planet {
    MARS, MERCURY("Mercury");

    private String name;
    private static String key;

    Planet() {
    }

    Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getKey() {
        return key;
    }

    public static void setKey(String key) {
        Planet.key = key;
    }
}

package com.mber.topic.pattern.singleton.simple_singleton;

public class MySingleton {
    public static final MySingleton instance = new MySingleton();

    private MySingleton() {
    }
}

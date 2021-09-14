package com.mber.topic.best_practice._367_singleton;

//approaches
//advantages
//serializable
//enum
public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton1.singleton);
        System.out.println(Singleton1.singleton);
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton3.getInstance());
        System.out.println(Singleton3.getInstance());
    }
}


class Singleton1 {
    public static final Singleton1 singleton = new Singleton1();

    private Singleton1() {
    }
}

class Singleton2 {
    private static final Singleton2 singleton = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton;
    }
}

class Singleton3 {
    private static final Singleton3 singleton = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }
}

enum MySingleton {
    INSTANCE;
    public void doJob(){

    }
}


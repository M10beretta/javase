package com.mber.topic.structure.metanit._3_enumeration_methods;

public class Main {
    public static void main(String[] args) {
        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }

        System.out.println(Type.BELLES_LETTRES.ordinal());
    }
}

enum Type {
    SCIENCE,
    BELLES_LETTRES,
    PHANTASY,
    SCIENCE_FICTION
}

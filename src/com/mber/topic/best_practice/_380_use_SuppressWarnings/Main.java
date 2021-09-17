package com.mber.topic.best_practice._380_use_SuppressWarnings;

import java.util.HashSet;
import java.util.Set;

//eliminate warnings
//use the smallest scope possible
//always comment
//QSuppressWarnings("unchecked")

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static Set<String> run() {

        @SuppressWarnings("unchecked")  //value return from old method
        Set<String> exaltation = new HashSet();
        return exaltation;
    }
}

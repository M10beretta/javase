package com.mber.topic.best_practice.husivm._388_overloading;

import java.io.ObjectOutputStream;
import java.util.*;

//overloading is counter-intuitive //it's confuse programmers
//overriding is static overloading is dynamic
//avoid confusing uses of overloading
//never to export two overloading with the same number of parameters
//it's safe when number of parameters is different
//it's safe if parameters radically different i.e. ArrayList and int but not Collection
//it's safe if methods do the same
//use constructors carefully //or static factory methods
//second example //adding generics and autoboxing to the language damaged the List interface //rules 33 pages
public class Main {
    public static void main(String[] args) {
        ObjectOutputStream objectOutputStream;
        confuse();
    }

    private static void confuse() {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i); //!
        }

        System.out.println(set + " " + list);
    }

    public static String classify(Collection<?> c) {
        return c instanceof Set ? "Set" :
                c instanceof List ? "List" : "Unknown Collection";
    }
}

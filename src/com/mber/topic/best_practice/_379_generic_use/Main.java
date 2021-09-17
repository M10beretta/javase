package com.mber.topic.best_practice._379_generic_use;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//don't use raw types
//two exceptions: 1) List<String>.class 2) instanceof
public class Main {
    public static void main(String[] args) {
        List listRaw;
        List<String> list;

        ArrayList<String> x = new ArrayList<>();

        System.out.println(x.getClass());
        System.out.println(x instanceof List);
    }

    //best
    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o : s1) {
            if (s2.contains((o)))
                result++;
        }
        return result;
    }

    //bad
    static int numElementsInCommonBad(Set s1, Set s2) {
        int result = 0;
        for (Object o : s1) {
            if (s2.contains((o)))
                result++;
        }
        return result;
    }
}

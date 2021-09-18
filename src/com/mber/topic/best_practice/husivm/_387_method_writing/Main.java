package com.mber.topic.best_practice.husivm._387_method_writing;

import java.util.Hashtable;
import java.util.Map;

//Choose method names carefully
//Too many methods make a class difficult to learn, use, document, test, and maintain
//Avoid long parameter lists //Long sequences of identically typed parameters are especially harmful
//1. break the method up into multiple methods
//2. create helper classes to hold groups of parameters
//3. Builder pattern
//For parameter types, favor interfaces over classes
//Prefer two-element enum types to boolean parameters
public class Main {
    public static void main(String[] args) {

    }

    public void doJob(Helper helper){

    }

    private class Helper {
        Map map;
        Long l;
        int i;
        Hashtable hashtable;
    }
}

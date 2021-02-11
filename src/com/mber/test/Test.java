package com.mber.test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        String max = list.stream().min( (s1, s2)-> s1.length()-s2.length() ).get();


    }

}







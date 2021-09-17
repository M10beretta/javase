package com.mber.topic.best_practice._381_List_vs_Array;

import java.util.ArrayList;
import java.util.List;

//arrays covariant
//better to find out at compile time
//no array of a generic type, a parameterized type, or a type parameter //new List<E>[] , new List<String>[J , new E[]
//Why generic array creation is illegal
//E , List<E> , and List<String> are non-reifiable types//reifiable types List<?> and Map<?,?>
//Generic varargs
public class Main {
    public static void main(String[] args) {
        List<?>[] list = new ArrayList<?>[4];
    }
}

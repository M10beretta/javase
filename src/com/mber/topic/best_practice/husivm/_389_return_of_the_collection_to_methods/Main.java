package com.mber.topic.best_practice.husivm._389_return_of_the_collection_to_methods;

import java.util.ArrayList;
import java.util.Collection;

//never return null from method that return collection or array, better return empty array
//don't make user of you api to do your job
//programmer can forget //it can shoot in a years
public class Main {
    public static void main(String[] args) {
        Collection<String> collection = getCollection();

        //bad
        if(collection!=null){}


    }

    static Collection<String> getCollection(){
        Collection<String> collection = new ArrayList<>();

        return collection;
    }
}

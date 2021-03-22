package com.mber.test.cats;

public class Main {
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();
        Runnable simba = new Lion();
        Runnable sherekhan = new Tiger();
        Runnable chester = new Cheetah();
        runAll(simba , sherekhan , chester);
        healAll(aibolit, (Cat) simba , (Cat)sherekhan , (Cat)chester);
    }

    public static void healAll(Aibolit aibolit, Cat ... cats){


            for (Cat cat : cats) {

                if (cat instanceof Cat) {
                    aibolit.healCat((Cat) cat);
                }

            }
    }
    public static void runAll(Runnable ... cats){
        for (Runnable cat : cats) {
            cat.run();
        }
    }
}

package com.mber.topic.best_practice._383_Enum_is_better_than_constants;

public class Main {
    public static void main(String[] args) {
        int i = (AppleOrange.APPLE_FUJI-AppleOrange.ORANGE_TEMPLE)/ AppleOrange.APPLE_PIPPIN;
        for (Apple value : Apple.values()) {
            System.out.println(value);
        }
    }
}

//pass apple to method that works with oranges
//can compare apples with oranges
//no namespace
//no string representation
//can't iterate
//String constants - performance issues //need to be compare to hard-coded constants
class AppleOrange {
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;
    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;
}

//final, singleton, implements Comparable and Serializable, we can add methods and fields
//enum is immutable - all fields should be final
enum Apple{
    FUJI, PIPPIN, GRANNY_SMITH;
    private final int i = 5;}
enum Orange{FUJI, PIPPIN, GRANNY_SMITH}


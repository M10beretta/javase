package com.mber.topic.convertation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListToGenericArray {
    public static void main(String[] args) {
        String[] strings = ListToGenericArray.convert(
                String.class,
                List.of("Val1", "Val2", "Val3")
        );
        System.out.println(Arrays.toString(strings));
    }

    public static <T> T[] convert(Class<T> clazz, List<T> values) {

        T[] array = (T[]) Array.newInstance(clazz, values.size());

        for (int i = 0; i < array.length; i++) {
            array[i] = values.get(i);
        }

        return array;
    }
}

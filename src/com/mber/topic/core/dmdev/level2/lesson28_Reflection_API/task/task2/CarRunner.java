package com.mber.topic.core.dmdev.level2.lesson28_Reflection_API.task.task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * 2. Для получения данных программа должна
 * использовать только get-методы (нельзя использовать
 * значения приватных полей).
 */


public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        System.out.println(car);
        System.out.println(generateInsert(car));
    }

    private static String generateInsert(Car car) {


        String template = "INSERT INTO %s.%s (%s) VALUES (%s);";

        Table table = car.getClass().getAnnotation(Table.class);
        Field[] fields = car.getClass().getDeclaredFields();


        String fieldNames = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Colum.class))
                .sorted(Comparator.comparing(Field::getName))
                .map(field -> field.getAnnotation(Colum.class))
                .map(Colum::name)
                .collect(Collectors.joining(", "));

        String fieldValues = Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(Colum.class))
                .sorted(Comparator.comparing(Field::getName))
                .map(field -> getMethodName(car, field))
                .map(method -> {
                    try {
                        return method.invoke(car);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(value -> "'" + value + "'")
                .collect(Collectors.joining(", "));

        return String.format(template, table.schema(), table.value(), fieldNames, fieldValues);

    }

    private static Method getMethodName(Car car, Field field) {
        try {
            String name = field.getName();
            return car.getClass().getMethod("get" + name.substring(0, 1).toUpperCase() + name.substring(1));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}


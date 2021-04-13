package com.mber.alishev.reflection.lesson42;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class<Person> personClass = Person.class;
        Class<? extends Person> personClass2 = person.getClass();
        Class<?> personClass3 = Class.forName("com.mber.alishev.reflection.lesson42.Person");

        System.out.println(personClass.getName());
        System.out.println(personClass2.getName());
        System.out.println(personClass3.getName());

        System.out.println("\n  methods:");
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getReturnType() + " "
                    + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("\n  fields:");
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }

        System.out.println("\n  annotations:");

        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) System.out.println("Yes");
        }

        Arrays.stream(annotations).forEach(value -> {
            if (value instanceof Author) System.out.println("Yes");
        });
    }
}

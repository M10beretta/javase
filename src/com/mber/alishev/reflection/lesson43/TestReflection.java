package com.mber.alishev.reflection.lesson43;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/* получить с консоли строковые значения,
найти класс который соответствует этому строковому значению,
создать объект этого класса и потом на этом объекте вызвать метод */

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        // название_класса  название_класса  название_метода
        Class<?> classObject1 = Class.forName(scanner.next());
        Class<?> classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        // будем динамически создавать два объекта и вызывать метод одного объекта на втором объекте
        Method method = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        method.invoke(o1,o2);

        System.out.println(o1);
    }
}

/*
com.mber.alishev.reflection.lesson43.Person java.lang.String setName -> Person{id=-1, name='String value'}
java.lang.Thread java.lang.String setName -> Thread[String value,5,main]
*/
package com.mber.topic.core.dmdev.level2.lesson28_Reflection_API.model;

import java.lang.reflect.*;

public class ReflictionApiExample {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User(25L, "Ivan",24);
        testMethods2(user);
    }

    private static void testMethods2(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = user.getClass().getDeclaredMethod("setName", String.class);
        method.invoke(user, "Sveta");
        System.out.println(user);

    }
    private static void testMethods1(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = user.getClass().getDeclaredMethod("getName");
        System.out.println(method.invoke(user));
    }

    private static void testFields2(Object object) throws IllegalAccessException {
        Field[] declaredFields = User.class.getSuperclass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(object);
            System.out.println(value);
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
            System.out.println(declaredField.getModifiers());
        }
    }
    private static void testFields1(User user) throws IllegalAccessException {
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(user);
            System.out.println(value);
        }
    }

    private static void testConatructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(5L, "Petr");
        System.out.println(petr);
    }

    private static void extracted2() {
        User user = new User(25L, "Ivan");
        Class<? extends User> userClass = user.getClass();
    }

    private static void extracted1() {
        Class<? extends User> userClass;
        Class<User> userClass1 = User.class;
        System.out.println(userClass = userClass1);
    }

    private class Test1 {

    }

    private static class Test {

    }

    private enum Test2 {

    }
}

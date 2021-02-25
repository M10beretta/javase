package com.mber.dmdev.level2.lesson28.model;

public class ReflictionApiExample {
    public static void main(String[] args) {
        User user = new User(25, "Ivan");
        Class<? extends User> userClass = user.getClass();
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

package com.mber.alishev.annotations.lesson40;
@MyAnnotation
public class Main {
    @MyAnnotation
    private String name;

    @MyAnnotation
    public Main() {
    }

    @MyAnnotation
    public void test(@MyAnnotation int value){
        @MyAnnotation String localVar = "Hello";
    }

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {
        new MyClass().myMethod();
    }
}

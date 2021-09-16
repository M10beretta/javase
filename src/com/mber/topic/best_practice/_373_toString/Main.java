package com.mber.topic.best_practice._373_toString;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.age=22;

        try {
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println(myClass);
        }
    }
}

class MyClass{
    String name;
    int age;

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

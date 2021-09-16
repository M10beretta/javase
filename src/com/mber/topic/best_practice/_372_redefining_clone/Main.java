package com.mber.topic.best_practice._372_redefining_clone;

import java.util.Date;

//no constructor
//never make the client do anything the library can do for the client
//final fields' problem
//creation time
//use constructor or factory analog //can use interface
//example
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //bed
        MyClass1 myClass1 = new MyClass1();
        MyClass1 clone1 = myClass1.clone();

        System.out.println(myClass1 != clone1);
        System.out.println(myClass1.getClass() == clone1.getClass());

        //best
        MyClass2 myClass2 = new MyClass2();
        MyClass2 clone2 = new MyClass2(myClass2);
    }
}

//bed
class MyClass1 implements Cloneable {
    int i;
    private Object[] objects;
    private Date creationTime; //can't final

    @Override
    protected MyClass1 clone() throws CloneNotSupportedException {
        return (MyClass1) super.clone();
    }
}

//best
class MyClass2 {
    int i;
    private Object[] objects;
    private final Date creationTime;

    public MyClass2() {
        this.creationTime = new Date();
    }

    public MyClass2(MyClass2 myClone) {
        this.i = myClone.i;
        this.objects = myClone.objects;
        this.creationTime = myClone.creationTime;
    }
}
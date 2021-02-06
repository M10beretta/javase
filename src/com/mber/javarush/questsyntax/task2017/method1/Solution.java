package com.mber.javarush.questsyntax.task2017.method1;

import java.io.ObjectInputStream;
import java.io.Serializable;

/*
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        A res;
        try {
             res = (A)objectStream.readObject();
        } catch (Exception e) {
            res = null;
            e.printStackTrace();
        }
        return res;
    }

    public class A implements Serializable{
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
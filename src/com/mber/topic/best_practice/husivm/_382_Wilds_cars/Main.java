package com.mber.topic.best_practice.husivm._382_Wilds_cars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

//PECS stands for producer-extends , consumer-super
//Do not use wildcard types as return types
public class Main {
    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = new ArrayList<>();
        numberStack.pushAll(integers);

        Collection<Object> objects = new ArrayList<>();
        numberStack.popAll(objects);
    }

}

class Stack<E> {
    private E[] elements;
    private int size = 0;
    public static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null; //Eliminate obsolete reference
        return result;
    }

                                   //1
    public void pushAll(Iterable<? extends E> src){
        for (E e : src) {
            push(e);
        }
    }

                                    //2
    public void popAll(Collection<? super E> dst){
        while (!dst.isEmpty())
            dst.add(pop());

    }

}

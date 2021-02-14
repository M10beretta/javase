package com.mber.dmdev.level2.lesson18;

public class List <T> {
    private T[] objects;
    private int size;

    public List(int initialsize){
        this.objects = (T[])new Object[initialsize];
    }

    public void add(T element){
        objects[size++] = element;
    }

    public T get(int index){
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}

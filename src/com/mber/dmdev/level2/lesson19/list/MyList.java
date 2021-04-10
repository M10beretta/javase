package com.mber.dmdev.level2.lesson19.list;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private T[] objects;
    private int size;

    public MyList(int initialsize) {
        this.objects = (T[]) new Object[initialsize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}
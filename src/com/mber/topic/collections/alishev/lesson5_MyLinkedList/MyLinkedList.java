package com.mber.topic.collections.alishev.lesson5_MyLinkedList;

import java.util.Arrays;

// односвязный непараметризованный список

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(int value) {

        if (head == null) {
            this.head = new Node(value);
        } else {
            Node nodeNew = new Node(value);
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(nodeNew);
        }
        size++;
    }

    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node temp = head;

        while (temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {

            if (currentIndex == index) {
                return temp.getValue();
            } else {

                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        int currentIndex = 0;
        Node temp = head;
        while (temp != null) {
            // находимся на ноде перед целевым
            if (currentIndex == index - 1) {
                // перепрыгивем через целевой
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

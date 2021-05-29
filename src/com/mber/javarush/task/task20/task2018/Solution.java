package com.mber.javarush.task.task20.task2018;

import java.io.*;

/*
Найти ошибки
*/

public class Solution implements Serializable {
    @Serial
    private static final long serialVersionUID = 7290649915366413218L;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var bufferOut = new ByteArrayOutputStream();
        var streamOut = new ObjectOutputStream(bufferOut);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        streamOut.writeObject(b);

        var bufferIn = new ByteArrayInputStream(bufferOut.toByteArray());
        var streamIn = new ObjectInputStream(bufferIn);

        B b1 = (B) streamIn.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }

    public static class A {
        protected String nameA = "A";
        public A() { }
        public A(String nameA) {
            this.nameA += nameA;
        }
    }

    public class B extends A implements Serializable {
        @Serial
        private static final long serialVersionUID = 2034160138369940634L;
        private final String  nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }

        @Serial
        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            out.writeObject(nameA);
        }

        @Serial
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            in.defaultReadObject();
            nameA = (String) in.readObject();
        }
    }
}
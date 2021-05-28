package com.mber.javarush.task.task20.task2013;

import java.io.*;
import java.util.List;

/*
Externalizable Person
*/

public class Solution {
    public static class Person implements Externalizable {
        @Serial
        private static final long serialVersionUID = -6005195374991820291L;
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }
        public void setFather(Person father) {
            this.father = father;
        }
        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(mother);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            mother = (Person) in.readObject();
            lastName = (String) in.readObject();
            father = (Person) in.readObject();
            age = (int) in.readObject();
            children = (List<Person>) in.readObject();
        }

        public Person() {
        }
    }

    public static void main(String[] args) {

    }
}

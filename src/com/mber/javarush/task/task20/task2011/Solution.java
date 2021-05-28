package com.mber.javarush.task.task20.task2011;

import java.io.*;

/*
Externalizable для апартаментов
*/

public class Solution {
    public static class Apartment implements Externalizable{
        @Serial
        private static final long serialVersionUID = 4332347584181052220L;
        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var apartment = new Apartment("г.Москва, Кутузовский просп., дом 18", 2017);
        var outputStream = new ObjectOutputStream(new FileOutputStream("src/com/mber/javarush/task/task20/task2011/file.bin"));
        outputStream.writeObject(apartment);
        outputStream.close();
        var inputStream = new ObjectInputStream(new FileInputStream("src/com/mber/javarush/task/task20/task2011/file.bin"));
        Apartment reApt = (Apartment) inputStream.readObject();
        System.out.println(reApt.toString());
        inputStream.close();

    }
}
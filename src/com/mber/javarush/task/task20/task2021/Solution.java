package com.mber.javarush.task.task20.task2021;

import java.io.*;

/*
Сериализация под запретом
*/

public class Solution implements Serializable {
    @Serial
    private static final long serialVersionUID = -7809036020389622765L;

    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException("Не сегодня!");
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException("Не сегодня!");
        }
    }

    public static void main(String[] args) {
    }
}



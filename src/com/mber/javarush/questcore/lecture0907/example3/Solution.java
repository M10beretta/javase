package com.mber.javarush.questcore.lecture0907.example3;

import java.io.PrintStream;

public class Solution {
    public static void main(String[] args) throws Exception {
// сохраняем System.out в свою переменную out
        PrintStream out = System.out;

// добавляем stream к файлу
        PrintStream ps = new PrintStream("file.ser");

// переопределяем System.out, для записи в наш файл вместо консоли
        System.setOut(ps);

// эта строка добавится в файл
        System.out.println("New text to our file.ser");

// переопределяем System.out обратно
        System.setOut(out);

// эта строка уже выведится в консоле, как обычно
        System.out.println("Output back to console");
    }

}

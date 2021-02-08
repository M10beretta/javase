package com.mber.test;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws IOException {
        FileInputStream source = null;
        try {
            source = new FileInputStream("c:\\note.txt");
            source.read();
        } catch (Exception except) {
            System.out.println("Перехватили исключение");
            throw except;
        } finally {
            if (source != null)
                source.close();
        }
    }
}



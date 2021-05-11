package com.mber.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "src/com/mber/javarush/task/task18/task1813/file.txt";
    private final FileOutputStream original;

    public AmigoOutputStream(FileOutputStream original) throws FileNotFoundException {
        super(fileName);
        this.original = original;
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        super.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        super.flush();
    }

    @Override
    public void close() throws IOException {
        original.flush();
        write("com.mber.javarush © All rights reserved.".getBytes());
        original.close();
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName)).close();
    }
}
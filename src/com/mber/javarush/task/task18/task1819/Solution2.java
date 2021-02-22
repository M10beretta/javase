package com.mber.javarush.task.task18.task1819;

import java.io.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream fis = new FileInputStream(fileName1);
        byte[] bytes1 = fis.readAllBytes();
        fis = new FileInputStream(fileName2);
        byte[] bytes2 = fis.readAllBytes();
        fis.close();

        FileOutputStream fos = new FileOutputStream(fileName1);
        fos.write(bytes2);
        fos.write(10);
        fos.write(bytes1);
        fos.close();
    }
}










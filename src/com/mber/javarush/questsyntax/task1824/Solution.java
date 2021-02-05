package com.mber.javarush.questsyntax.task1824;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = reader.readLine();
            try {
                new FileInputStream(fileName).close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }
    }
}
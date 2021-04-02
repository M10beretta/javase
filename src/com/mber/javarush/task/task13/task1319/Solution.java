package com.mber.javarush.task.task13.task1319;

import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String destinationFileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));
        StringBuilder builder = new StringBuilder();

        extracted1(reader, builder);

        writer.write(builder.toString());
        writer.close();
    }

    private static void extracted2(BufferedReader reader, StringBuilder builder) throws IOException {
        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            builder.append(s).append("\n");
        }
    }

    private static void extracted1(BufferedReader reader, StringBuilder builder) throws IOException {
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) break;
            builder.append(s).append("\n");
        }
    }
}
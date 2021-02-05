package com.mber.javarush.questsyntax.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
*/

public class Solution1 {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) break;
            new ReadThread(fileName).start();
        }
    }

    public static class ReadThread extends Thread {
        private final String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {

            byte[] bytesCount = new byte[256];
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0) bytesCount[fileInputStream.read()]++;
            } catch (IOException e) {
                e.printStackTrace();
            }

            int mostFrByte = 0;
            for (int i = 1; i < bytesCount.length - 1; i++) {
                if (bytesCount[i + 1] > bytesCount[i]) {
                    mostFrByte = i + 1;
                }
            }
            resultMap.put(fileName, mostFrByte);
        }
    }
}


package com.mber.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (String fileName = reader.readLine(); !fileName.equals("exit"); fileName = reader.readLine()) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
        System.out.println(resultMap);
    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
            FileInputStream inputStream = new FileInputStream(fileName);
            while (inputStream.available() > 0) list.add(inputStream.read());
            inputStream.close();
        }

        private final String fileName;
        List<Integer> list = new ArrayList<>();

        @Override
        public void run() {
            int element = list.get(0);
            for (Integer x : list)
                if (Collections.frequency(list, x) > Collections.frequency(list, element)) element = x;
            resultMap.put(fileName, element);
        }
    }
}


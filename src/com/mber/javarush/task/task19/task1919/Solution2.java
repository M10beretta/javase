package com.mber.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/*
Считаем зарплаты
*/

public class Solution2 {
    public static void main(String[] args) {
        args = new String[]{"src/com/mber/javarush/task/task19/task1919/file.txt"};

        TreeMap<String, Double> salary = new TreeMap<>();
        String fileName = args[0];
        try (BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
            String[] splitLine;
            String line;
            Double currentValue;
            while ((line = rd.readLine()) != null) {
                splitLine = line.split(" ");
                String name = splitLine[0];
                double value = Double.parseDouble(splitLine[1]);
                if (salary.containsKey(name)) {
                    currentValue = salary.get(name);
                    salary.put(name, value + currentValue);
                } else salary.put(name, value);
            }
        } catch (IOException ignore) { /*NOP */}
        for (String key : salary.keySet()) System.out.println(key + " " + salary.get(key));
    }
}


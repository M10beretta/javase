package com.mber.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;

/*
Считаем зарплаты
*/

public class Solution1 {
    public static void main(String[] args) throws IOException {
        args = new String []{"src/com/mber/javarush/task/task19/task1919/file.txt"};

        TreeMap<String, Double> treeMap = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (true) {
                String sting = reader.readLine();
                if (sting == null) break;
                String key = sting.replaceAll("[^a-яА-я]+", "");
                double value = Double.parseDouble(sting.replaceAll("[a-яА-я]+ ", "").trim());

                if (treeMap.containsKey(key)) {
                    double newValue = treeMap.get(key) + value;
                    treeMap.put(key, newValue);
                } else treeMap.put(key, value);
            }
        }

        for (Map.Entry<String, Double> stringIntegerEntry : treeMap.entrySet()) {
            System.out.printf("%s %s\n", stringIntegerEntry.getKey(),
                    new DecimalFormat("#.0#").format(stringIntegerEntry.getValue()).replaceAll(",", "."));
        }
    }
}

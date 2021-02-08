package com.mber.javarush.task.task1920.method2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> treeMap = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String[] splitLine;
            String line;

            while ((line = reader.readLine()) != null) {
                splitLine = line.split(" ");
                String name = splitLine[0];
                double value = Double.parseDouble(splitLine[1]);

                treeMap.merge(name, value, Double::sum);

            }

        } catch (IOException ignore) {
            /*NOP*/
        }
        double maxValue = treeMap.firstEntry().getValue();
        for (Double value : treeMap.values()) {
            if(value > maxValue) maxValue = value;
        }

        for (String s : treeMap.keySet()) {
            if (treeMap.get(s).equals(maxValue)) System.out.println(s);
        }
    }
}
/*


 */